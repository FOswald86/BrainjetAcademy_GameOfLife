import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {

            int num = scanner.nextInt();
            boolean isDivisible = num % 6 == 0;

            if (isDivisible) {
                sum += num;
            }
        }

        System.out.println(sum);

    }
}
