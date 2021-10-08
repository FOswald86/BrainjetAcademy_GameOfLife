import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int len = scanner.nextInt();
        int[] array = new int[len];
        int counter = 1;
        int tempNumber;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        tempNumber = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > tempNumber) {
                counter++;
                tempNumber = array[i];
            }
        }
        System.out.println(counter);
    }
}