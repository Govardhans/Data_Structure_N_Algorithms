package practice.arrayExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class Minesweeper {
    public static void main(String[] args) {
        int[][] bomb = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        int row = 5;
        int col = 5;
        int[][] resultArray = new int[row][col];
        placeBomb(bomb, resultArray);
        printArray(resultArray);
    }

    private static void placeBomb(int[][] bomb, int[][] resultArray) {
        for (int i = 0; i < bomb.length; i++) {
            int col = bomb[i][1];
            int row = bomb[i][0];
            resultArray[row][col] = -1;
            for (int j = row - 1; j < row + 2; j++) {
                if (j >= resultArray.length || j < 0) {
                    continue;
                }
                for (int k = col - 1; k < col + 2; k++) {
                    if (k > resultArray[j].length) {
                        continue;
                    }
                    if (j == -1 || k == -1) {
                        continue;
                    }
                    if (j == row && k == col) {
                        continue;
                    }
                    if (resultArray[j][k] == -1) {
                        continue;
                    }

                    System.out.println(j + " " + k);
                    resultArray[j][k] = resultArray[j][k] + 1;
                }
            }
            //2 1
            //1 1
            //
        }
        System.out.println();
    }


    private static void printArray(int[][] bomb) {
        for (int i = 0; i < bomb.length; i++) {
            for (int j = 0; j < bomb[i].length; j++) {
                if (bomb[i][j] == -1) {
                    System.out.print(" " + bomb[i][j] + "  ");
                } else {
                    System.out.print("  " + bomb[i][j] + "  ");
                }
            }
            System.out.println();
        }
    }
}
