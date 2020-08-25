package practice.arrayExample;

public class MinesweeperRevealCells {

    public static void main(String[] args) {
        int[][] gameBoard = {{0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0},
                {0, 1, -1, 1, 0}};
        int[][] click = {{0, 1}};
        revealCells(gameBoard, click);
        printArray(gameBoard);
    }

    private static int[][] revealCells(int[][] gameBoard, int[][] click) {
        int row = gameBoard.length;
        int col = gameBoard[0].length;
        int rowClick = click[0][0];
        int colClick = click[0][1];

        if (gameBoard[rowClick][colClick] != 0) {
            return gameBoard;
        }

        for (int i = rowClick; i < row; i++) {
            for (int k = colClick; k < col; k++) {
                if (gameBoard[i][k] == 0)
                    System.out.println(i + " " + k + " = " + gameBoard[i][k]);
            }
        }

        for (int j = rowClick; j >= 0; j--) {
            for (int l = colClick; l >= 0; l--) {
                if (gameBoard[j][l] == 0)
                    System.out.println(j + " " + l + " = " + gameBoard[j][l]);
            }
        }


        System.out.println();
        return gameBoard;
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
