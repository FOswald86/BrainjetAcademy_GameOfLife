package life;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        //long seed = scanner.nextLong();
        int generations = 1; //scanner.nextInt();
        scanner.close();

        Universe universe = new Universe(size);
        universe.populate(universe);

        while (generations <= 10) {
            System.out.println("Generation #" + generations);
            System.out.println("Alive: " + universe.getAliveCount(universe) + "\n");
            universe.print(universe);
            Universe universeNextGen = new Universe(size);
            universeNextGen = universe.copyUniverse(universe, universeNextGen);
            universe = universe.evolve(universe, universeNextGen);
            generations++;
            Thread.sleep(500);
        }
    }
}