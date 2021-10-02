package life;
import java.util.Scanner;

public class Main {
    private static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        int size = in.nextInt();
        long seed = in.nextLong();
        int generations = in.nextInt();

        Universe universe = new Universe(size, seed);
        universe.populate();
        Universe universeNextGen = new Universe(size, seed);



        while (generations > 0) {
            universeNextGen.evolve(universe, universeNextGen);
        }

        universe.print();

    }
}