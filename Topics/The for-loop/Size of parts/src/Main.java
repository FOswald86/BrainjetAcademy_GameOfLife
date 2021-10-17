import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int perfect = 0;
        int fix = 0;
        int rejects = 0;
        while (scanner.hasNext()) {
            int temp = scanner.nextInt();
            if (temp < 0) {
                rejects++;
            } else if (temp > 0 ) {
                fix++;
            } else {
                perfect++;
            }
        }
        System.out.printf("%n%d %d %d", perfect, fix, rejects);
    }
}