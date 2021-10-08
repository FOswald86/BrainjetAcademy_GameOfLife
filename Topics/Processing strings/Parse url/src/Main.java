import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] url = input.split("[=&?]");
        ArrayList<String> results = new ArrayList<>();
        String pw = "";
        for (int i = 0; i < url.length - 1; i++) {
            if (url[i].equals("pass") || url[i].equals("port") || url[i].equals("cookie") || url[i].equals("host") ||
                    url[i].equals("name")) {
                if (url[i].equals("pass")) {
                    pw += "password : " + url[i + 1];
                }
                    results.add(url[i] + " : " + (url[i + 1].equals("") ? "not found" : url[i + 1]));
            }
        }
        for (String s : results) {
            System.out.println(s);
        }
        if (!pw.equals("")) {
            System.out.println(pw);
        }
    }
}