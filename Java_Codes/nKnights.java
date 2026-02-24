import java.util.Scanner;

public class nKnights {
    static int possibilities = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of knights");
        int k = sc.nextInt();
        System.out.println("Enter the size of the board");
        int n = sc.nextInt();
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                board[i][j] = '.';
            }
        }
        placeKnights(board, 0, 0, k);
        System.out.println("Total Possibilities: " + possibilities);
    }
    private static void printBoard(char[][] board) {
        System.out.println();
        int n = board.length;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void placeKnights(char[][] board, int row, int col, int k) {
        int n = board.length;
        if(row == n) {
            if(k == 0) {
                printBoard(board);
                possibilities++;
            }
            return;
        }
        int nextRow = (col+1 == n ? row+1 : row);
        int nextCol = (nextRow>row ? 0 : col+1);
        if(isSafe(board, row, col)){
            board[row][col] = 'K';
            placeKnights(board, nextRow, nextCol, k-1);
            board[row][col] = '.';
        }
        placeKnights(board, nextRow, nextCol, k);
    }
    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
        if(row >= 2) {
            if(col >= 1){
                if(board[row-2][col-1] == 'K') {
                    return false;
                }
            }
            if(col < n-1) {
                if(board[row-2][col+1] == 'K') {
                    return false;
                }
            }
        }
        if(row <= n-3) {
            if(col >= 1){
                if(board[row+2][col-1] == 'K') {
                    return false;
                }
            }
            if(col < n-1) {
                if(board[row+2][col+1] == 'K') {
                    return false;
                }
            }
        }
        if(col >= 2) {
            if(row >= 1){
                if(board[row-1][col-2] == 'K') {
                    return false;
                }
            }
            if(row < n-1) {
                if(board[row+1][col-2] == 'K') {
                    return false;
                }
            }
        }
        if(col <= n-3) {
            if(row >= 1){
                if(board[row-1][col+2] == 'K') {
                    return false;
                }
            }
            if(row < n-1) {
                if(board[row+1][col+2] == 'K') {
                    return false;
                }
            }
        }
        return true;
    }
}