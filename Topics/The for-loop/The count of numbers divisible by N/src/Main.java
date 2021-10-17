import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        System.out.println(a % n == 0 ? b / n - a / n + 1 : b / n - a / n);
    }
}