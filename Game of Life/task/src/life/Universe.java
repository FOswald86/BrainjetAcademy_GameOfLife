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

    public Universe(int size) {
        this.size = size;
        this.population = new Cell[size][size];
    }

    public void evolve(Universe universe) {
        // find neighbors
        int neighborsCount = 0;
        int length = universe.size - 1;
        for (int row = 0; row < length; row++) {
            for (int column = 0; column < length; column++) {

                // above row + one to the left
                if (population[row == 0 ? length : row - 1][column == 0 ? length : column - 1].isAlive) {
                    neighborsCount++;
                }
                // above row... center
                if (population[row == 0 ? length : row - 1][column].isAlive) {
                    neighborsCount++;
                }
                // above row + one to the right
                if (population[row == 0 ? length : row - 1][column == length ? 0 : column + 1].isAlive) {
                    neighborsCount++;
                }

                // middle row + 1 to the left
                if (population[row][column == 0 ? length : column - 1].isAlive) {
                    neighborsCount++;
                }
                // middle row... center
                /*if (population[row][column].isAlive) {
                    neighborsCount++;
                }*/
                // middle row + 1 to the right
                if (population[row][column == length ? 0 : column + 1].isAlive) {
                    neighborsCount++;
                }

                // bottom row + 1 to the left
                if (population[row == length ? 0 : row + 1][column == 0 ? length : column - 1].isAlive) {
                    neighborsCount++;
                }
                // bottom row... center
                if (population[row == length ? 0 : row + 1][column == 0 ? length : column].isAlive) {
                        neighborsCount++;
                }
                // bottom row + 1 to the right
                if (population[row == length ? 0 : row + 1][column == length ? 0 : column + 1].isAlive) {
                    neighborsCount++;
                }
                if (neighborsCount == 3 && !(population[row][column].isAlive)) {
                    population[row][column] = new Cell(true);
                }
                if (neighborsCount < 2 && population[row][column].isAlive) {
                    population[row][column] = new Cell(false);
                }
                if (neighborsCount > 3 && population[row][column].isAlive) {
                    population[row][column] = new Cell(false);
                }
            }
        }
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