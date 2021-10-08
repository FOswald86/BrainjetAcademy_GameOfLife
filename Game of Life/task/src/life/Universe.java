package life;

import java.util.Random;

class Universe {
    int size;
    long seed;
    boolean[][] population;

    public Universe(int size, long seed) {
        this.size = size;
        this.seed = seed;
        this.population = new boolean[size][size];
    }

    public Universe(int size) {
        this.size = size;
        this.population = new boolean[size][size];
    }

    public Universe copyUniverse(Universe universe, Universe universeNextGen) {
        for (int i = 0; i < universe.population.length; i++) {
            for (int j = 0; j < universe.population.length; j++) {
                universeNextGen.population[i][j] = universe.population[i][j];
            }
        }
        return universeNextGen;
    }

    public Universe evolve(Universe universe, Universe universeNextGen) {
        // find neighbors
        int length = universe.population.length - 1;
        for (int row = 0; row < universe.population.length; row++) {
            for (int column = 0; column < universe.population.length; column++) {
                int neighborsCount = 0;

                // coordinate idea
                /*
                universe.population[row == 0 ? length : row - 1][column == 0 ? length : column - 1]
                 */
                // above row left
                if (universe.population[row == 0 ? length : row - 1][column == 0 ? length : column - 1]) {
                    neighborsCount++;
                }
                // above row center
                if (universe.population[row == 0 ? length : row - 1][column]) {
                    neighborsCount++;
                }
                // above row right
                if (universe.population[row == 0 ? length : row - 1][column == length ? 0 : column + 1]) {
                    neighborsCount++;
                }

                // middle row left
                if (universe.population[row][column == 0 ? length : column - 1]) {
                    neighborsCount++;
                }
                // middle row center
                // middle row right
                if (universe.population[row][column == length ? 0 : column + 1]) {
                    neighborsCount++;
                }

                // bottom row left
                if (universe.population[row == length ? 0 : row + 1][column == 0 ? length : column - 1]) {
                    neighborsCount++;
                }
                // bottom row center
                if (universe.population[row == length ? 0 : row + 1][column]) {
                    neighborsCount++;
                }
                // bottom row right
                if (universe.population[row == length ? 0 : row + 1][column == length ? 0 : column + 1]) {
                    neighborsCount++;
                }

                // conditions
                // A live cell survives if it has two or three live neighbors; otherwise, it dies of boredom (<2) or overpopulation (>3).
                // A dead cell is reborn if it has exactly three live neighbors.
                if (universe.population[row][column]) {
                    universeNextGen.population[row][column] = neighborsCount >= 2 && neighborsCount <= 3;
                } else {
                    universeNextGen.population[row][column] = neighborsCount == 3;
                }
            }
        }
        return universeNextGen;
    }

    public void populate(Universe universe) {
        Random random = new Random();
        for (int i = 0; i < population.length; i++) {
            for (int j = 0; j < population.length; j++) {
                universe.population[i][j] = random.nextBoolean();
            }
        }
    }

    public void print(Universe universe) {
        for (boolean[] row : universe.population) {
            for (boolean alive : row) {
                System.out.print(alive ? "O" : " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public int getAliveCount(Universe universe) {
        int count = 0;
        for (int i = 0; i < population.length; i++) {
            for (int j = 0; j < population.length; j++) {
                if (population[i][j]) {
                    count++;
                }
            }
        }
        return count;
    }
}
