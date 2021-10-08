import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] chars = scanner.nextLine().toLowerCase(Locale.ROOT).toCharArray();
        int counter = 0;
        for (char aChar : chars) {
            if (aChar == 'g' || aChar == 'c') {
                counter++;
            }
        }
        System.out.println(((double) counter / chars.length) * 100);
    }
}