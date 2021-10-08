import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String sIn = scanner.nextLine();
        String sOut = "";
        for (int i = 0; i < sIn.length(); i++) {
            sOut += sIn.charAt(i);
            sOut += sIn.charAt(i);
        }
        System.out.println(sOut);
    }
}