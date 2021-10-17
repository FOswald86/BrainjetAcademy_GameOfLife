import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] time = new int[6];
        for (int i = 0; i < time.length; i++) {
            time[i] = scanner.nextInt();
        }
        System.out.println((time[3] * 3600 + time[4] * 60 + time[5]) - (time[0] * 3600 + time[1] * 60 + time[2]));
    }
}