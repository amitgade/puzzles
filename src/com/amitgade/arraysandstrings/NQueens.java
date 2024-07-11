package com.amitgade.arraysandstrings;

public class NQueens {
    private static final int N = 8;
    private static int[][] chessboard = new int[N][N];

    // Function to check if a queen can be placed
    private static boolean isValid(int row, int col) {
        // Check if any queen is placed in the same row
        for (int i = 0; i < col; i++) {
            if (chessboard[row][i] == 1) {
                return false;
            }
        }

        // Check if any queen is placed in the same diagonal
        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        // Check if any queen is placed in the same diagonal
        for (int i = row, j = col; i < N && j >= 0; i++, j--) {
            if (chessboard[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    // Function to solve N-Queens problem using backtracking
    private static boolean solveNQueensUtil(int col) {
        // Base case: If all queens are placed
        if (col >= N) {
            return true;
        }

        // Consider this column and try placing this queen in all rows one by one
        for (int i = 0; i < N; i++) {
            // Check if queen can be placed on board[i][col]
            if (isValid(i, col)) {
                // Place this queen in board[i][col]
                chessboard[i][col] = 1;

                // Recur to place rest of the queens
                if (solveNQueensUtil(col + 1)) {
                    return true;
                }

                // If placing queen in board[i][col] doesn't lead to a solution, then backtrack
                chessboard[i][col] = 0; // BACKTRACK
            }
        }

        return false;
    }

    // Function to solve N-Queens problem
    public static void solveNQueens() {
        if (solveNQueensUtil(0)) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    System.out.print(chessboard[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No solution exists");
        }
    }

    // Driver code
    public static void main(String args[]) {
        solveNQueens();
    }
}
