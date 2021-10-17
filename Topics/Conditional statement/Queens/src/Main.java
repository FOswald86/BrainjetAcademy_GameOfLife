import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] coordinates = new int[4];
        for (int i = 0; i < coordinates.length; i++) {
            coordinates[i] = scanner.nextInt();
        }
        System.out.println(coordinates[0] == coordinates[2] || coordinates[1] == coordinates[3]
                || Math.abs(coordinates[2] - coordinates[0]) == Math.abs(coordinates[3] - coordinates[1])
                ? "YES" : "NO");
    }
}