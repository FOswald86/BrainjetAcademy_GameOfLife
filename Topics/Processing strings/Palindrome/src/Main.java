import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String s = new Scanner(System.in).next();
        StringBuilder str = new StringBuilder(s);
        System.out.print(s.equals(str.reverse().toString()) ? "yes" : "no");
    }
}