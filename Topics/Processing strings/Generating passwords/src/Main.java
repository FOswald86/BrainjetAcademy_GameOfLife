import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder pw = new StringBuilder();
        int upper = scanner.nextInt();
        int lower = scanner.nextInt();
        int digits = scanner.nextInt();
        int length = scanner.nextInt();

        for (int i = 0; i < upper; i++) {
            pw.append(i % 2 == 0 ? "A" : "B");
        }
        for (int i = 0; i < lower; i++) {
            pw.append(i % 2 == 0 ? "a" : "b");
        }
        for (int i = 0; i < digits; i++) {
            pw.append(i % 2 == 0 ? "1" : "2");
        }
        for (int i = pw.length(); i < length; i++) {
            pw.append(i % 2 == 0 ? "A" : "B");
        }
        System.out.println(pw);
    }
}