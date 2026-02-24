import java.util.*;

public class SudokuSolver {
    public boolean isSafe(char[][] board, int row, int col, int number) {
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == (char) (number + '0')) {
                return false;
            }
            if (board[row][i] == (char) (number + '0')) {
                return false;
            }
        }
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (board[i][j] == (char) (number + '0')) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean helper(char[][] board, int i, int j) {
        if (i == 9) {
            return true;
        }
        int nextI = (j == 8) ? i + 1 : i;
        int nextJ = (j + 1) % 9;
        if (board[i][j] != '.') {
            return helper(board, nextI, nextJ);
        }

        for (int index = 1; index < 10; index++) {
            if (isSafe(board, i, j, index)) {
                board[i][j] = (char) ('0' + index);
                if (helper(board, nextI, nextJ)) {
                    return true;
                }
                board[i][j] = '.';
            }
        }

        return false;
    }

    public void solveSudoku(char[][] board) {
        helper(board, 0, 0);
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') {
                    System.out.print("\u001B[31m" + c + " \u001B[0m"); // Red for blanks
                } else {
                    System.out.print("\u001B[32m" + c + " \u001B[0m"); // Green for filled
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SudokuSolver sudoku = new SudokuSolver();
        System.out.println("Welcome to Sudoku Solver, do you wanna enter your own sudoku?? Type y or n");
        String input = sc.next();
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };
        if (input.charAt(0) == 'y') {
            System.out.println("Type '.' for blank spaces");
            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < 9; j++) {
                    board[i][j] = (char) (sc.nextInt() + '0');
                }
            }
        }

        System.out.println("Your unsolved sudoku is :-");
        printBoard(board);
        sudoku.solveSudoku(board);
        System.out.println("The solved version of your Sudoku is :-");
        printBoard(board);
    }
}
