import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "\\b((25[0-5]|2[0-4][0-9]|[01]*[0-9]*[0-9]+)(\\.|$)){4}\\b";

        String ip = scanner.nextLine();
        System.out.println(ip.matches(regex) ? "YES" : "NO");
    }
}