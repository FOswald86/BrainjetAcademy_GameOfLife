import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputDate = scanner.nextLine();
        String[] array = inputDate.split("-", 3);
        System.out.println(array[1] + "/" + array[2] + "/" + array[0]);
    }
}
