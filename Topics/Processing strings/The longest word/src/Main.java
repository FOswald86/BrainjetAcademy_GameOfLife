import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] array = sc.nextLine().split(" ");
        String longestString = "";
        for (String word : array) {
            if (longestString.length() < word.length()) {
                longestString = word;
            }
        }
        System.out.println(longestString);
    }
}