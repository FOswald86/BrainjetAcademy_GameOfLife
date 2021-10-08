import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String n = scanner.nextLine();
        int[] array = new int[n.length()];
        for (int i = 0; i < n.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(n.charAt(i)));
        }
        if (array[0] + array[1] + array[2] == array[3] + array[4] + array[5]) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}