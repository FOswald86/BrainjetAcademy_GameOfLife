import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0, b = 0, c = 0, d = 0;
        int[] grades = new int[n];

        for (int i = 0; i < grades.length; i++) {
            grades[i] = scanner.nextInt();
            if (grades[i] == 2) {
                d++;
            } else if (grades[i] == 3) {
                c++;
            } else if (grades[i] == 4) {
                b++;
            } else if (grades[i] == 5) {
                a++;
            }
        }
        System.out.printf("%n%d %d %d %d", d, c, b, a);
    }
}