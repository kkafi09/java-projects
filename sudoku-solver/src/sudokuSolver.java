public class sudokuSolver {
    private static final int GRID_SIZE = 9;

    public static void main(String[] args) {

        int[][] board = {
                {0,0,0,0,0,3,4,0,0},
                {0,9,0,0,0,5,1,6,0},
                {8,0,0,0,0,0,0,0,0},
                {0,0,0,0,0,0,0,0,0},
                {0,2,0,0,8,0,0,3,0},
                {0,0,3,0,4,0,9,0,0},
                {0,0,0,5,0,2,0,8,0},
                {3,0,0,0,0,0,0,4,7},
                {7,5,0,0,0,0,0,0,1},
        };


        solveBoard(board);
        printBoard(board);

        if (solveBoard(board)){
            System.out.println("solved");
        } else {
            System.out.println("unsolved ");
        }

        printBoard(board);
    }

    public static void printBoard(int[][] board) {
        for (int i = 0; i < GRID_SIZE; i++) {
            if (i % 3 == 0 && i != 0) {
                System.out.println("--------------------");
            }
            for (int j = 0; j < GRID_SIZE; j++) {
                if (j % 3 == 0 && j != 0) {
                    System.out.print("|");
                }
                System.out.print(board[i][j] + " ");
            }System.out.println();
        }
    }

    public static boolean isValidInRow(int[][] board, int number, int row){
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[row][i] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidInColumn(int[][] board, int number, int column){
        for (int i = 0; i < GRID_SIZE; i++) {
            if (board[i][column] == number){
                return true;
            }
        }
        return false;
    }

    public static boolean isValidInBox(int[][] board, int number, int row, int column){
        int localRowInBox = row - row % 3;
        int localColumnInBox = column - column % 3;

        for (int i = localRowInBox; i < localRowInBox + 3 ; i++) {
            for (int j = localColumnInBox; j < localColumnInBox + 3; j++) {
                if (board[i][j] == number){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean possible(int[][] board, int number, int row, int column){
        return !isValidInRow(board, number, row) && !isValidInColumn(board, number,column) && !isValidInBox(board, number, row, column);
    }

    private static boolean solveBoard(int[][] board) {
        for (int row = 0; row < GRID_SIZE; row++) {
            for (int column = 0; column < GRID_SIZE; column++) {
                if (board[row][column] == 0) {
                    for (int numberToTry = 1; numberToTry <= GRID_SIZE; numberToTry++) {
                        if (possible(board, numberToTry, row, column)) {
                            board[row][column] = numberToTry;
//                            printBoard(board);

                            if (solveBoard(board)) {
                                return true;
                            } else {
                                board[row][column] = 0;
                            }
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
}

// https://www.codepile.net/pile/Mn4kDKwW