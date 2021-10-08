import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] string = scanner.nextLine().split(" ");
        boolean check = true;
        for (int i = 0; i < string.length - 1; i++) {
            if (string[i].length() > string[i + 1].length() || string[i].compareTo(string[i + 1]) > 0) {
                check = false;
                break;
            }
        }
        System.out.println(check);
    }
}