import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int temp : numbers) {
            if (temp < min) {
                min = temp;
            }
        }
        System.out.println(min);
    }
}