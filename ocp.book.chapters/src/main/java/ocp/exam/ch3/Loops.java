package ocp.exam.ch3;

public class Loops {
    public int[] example1() {
        int posX = 0, posY = 0;
        int[][] coords = {{1, 0, 2}, {0, 0, 2}, {3, 2, 3}};
        PARENT_LOOP: for (int i = 0; i < coords.length; i++) {
            for (int j = 0; j < coords[i].length; j++) {
                if (coords[i][j] == 2) {
                    posX = i;
                    posY = j;
                    break PARENT_LOOP;
                }
            }
        }
        return new int[] {posX, posY};
    }

    public void example2() {
        CLEANING: for (char stables = 'a'; stables <= 'd'; stables++) {
            for (int leopard = 1; leopard < 4; leopard++) {
                if (stables == 'b' || leopard == 2) {
                    continue CLEANING;
                }
                System.out.println("Cleaning stables=" + stables + ", leopard="+ leopard);
            }
        }
    }
}
