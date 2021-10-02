package life;

import java.util.Random;

class Universe {
    int size;
    long seed;
    Cell[][] population;

    public Universe(int size, long seed) {
        this.size = size;
        this.seed = seed;
        this.population = new Cell[size][size];
    }

    public void evolve(Universe universe, Universe universeNextGen) {
        
    }

    public void populate() {
        Random random = new Random(seed);
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                population[i][j] = new Cell(random.nextBoolean());
            }
        }
    }

    public void print() {
        for (Cell[] cells : population) {
            for (int j = 0; j < population.length; j++) {
                System.out.print(cells[j].isAlive ? 'O' : ' ');
            }
            System.out.println();
        }
    }
}