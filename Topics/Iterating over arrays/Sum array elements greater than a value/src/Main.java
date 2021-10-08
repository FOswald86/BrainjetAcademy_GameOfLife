import java.util.Scanner;

class Main {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);
        
        //System.out.println("How many numbers you want to enter?");
        int size = scanner.nextInt();
        int[] array = new int[size];
        
        //System.out.printf("Enter %d numbers%n", size);
        for (int i = 0; i < array.length; i++) {
			array[i] = scanner.nextInt();
		}
        
        //System.out.println("From which value the numbers should get counted?");
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
			if (array[i] > n) {
				sum += array[i];
			}
		}
        
        System.out.println(sum);
    }
}
