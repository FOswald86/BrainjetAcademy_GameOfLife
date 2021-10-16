package life;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        
        Universe universe = new Universe();
        universe.populate(universe);

        // while button play/toggle
        while (true) {
            Universe universeNextGen = new Universe();
            universe = universe.evolve(universe, universeNextGen);
            Thread.sleep(1000);
        }
    }
}