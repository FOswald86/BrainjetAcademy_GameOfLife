import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int count = 0;
        int sum = 0;

        for (int i = b; i >= a; i--) {
            if (i % 3 == 0) {
                sum += i;
                count++;
            }
        }

        System.out.println((double) sum / count);
    }
}