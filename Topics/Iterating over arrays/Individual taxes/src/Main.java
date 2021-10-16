import java.util.*;

public class Main {
    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        int companiesCount = scanner.nextInt();
        double[] companiesIncomes = new double[companiesCount];
        double[] companiesTaxes = new double[companiesCount];

        for (int i = 0; i < companiesCount; i++) {
            companiesIncomes[i] = scanner.nextDouble();
        }

        for (int i = 0; i < companiesCount; i++) {
            companiesTaxes[i] = scanner.nextDouble() / 100;
        }

        int index = 1;
        for (int i = 1; i < companiesCount; i++) {
            if (companiesIncomes[i - 1] * companiesTaxes[i - 1] < companiesIncomes[i] * companiesTaxes[i]) {
                index = i + 1;
            }
        }
        System.out.println(index);
    }
}