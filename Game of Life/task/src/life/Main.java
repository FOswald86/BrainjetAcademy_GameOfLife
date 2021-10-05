package life;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        long seed = scanner.nextLong();
        int generations = scanner.nextInt();
        scanner.close();

        Universe universe = new Universe(size, seed);
        universe.populate(universe);

        while (generations > 0) {
            Universe universeNextGen = new Universe(size);
            universeNextGen = universe.copyUniverse(universe, universeNextGen);
            universe = universe.evolve(universe, universeNextGen);
            generations--;
        }
        universe.print(universe);
    }
}