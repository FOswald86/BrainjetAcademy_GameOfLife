import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=\\S+$).{12,}$";

        String ip = scanner.nextLine();
        System.out.println(ip.matches(regex) ? "YES" : "NO");
    }
}