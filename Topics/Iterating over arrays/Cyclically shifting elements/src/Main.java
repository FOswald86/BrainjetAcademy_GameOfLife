import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int size = scanner.nextInt();
        int[] array = new int[size];
        int[] cyc = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print(array[size - 1] + " ");
        for (int i = 0; i < array.length - 1; i++) {
            System.out.print(array[i] + " ");
        }
        scanner.close();
    }
}
