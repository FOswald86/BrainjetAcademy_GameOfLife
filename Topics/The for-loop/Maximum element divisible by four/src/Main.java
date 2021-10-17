import java.util.Scanner;

class Main {

    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = 0;

        for (int i = 0; i < n; i++) {
            int in = scanner.nextInt();
            if (in > max) {
                if (in % 4 == 0) {}
                    max = in;
                }
            }
        }
        System.out.println(max);
        scanner.close();
    }
}
