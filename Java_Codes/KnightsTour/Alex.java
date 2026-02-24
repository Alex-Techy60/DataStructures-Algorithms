
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Alex {
    static int[] dx = { -2, -1, 1, 2, 2, 1, -1, -2 };
    static int[] dy = { 1, 2, 2, 1, -1, -2, -2, -1 };

    public static void canFinish(int n) {
        int[][] board = new int[n][n];
        if (helper(board, 0, 0, 1)) {
            printArray(board);
        } else {
            System.out.println(-1);
        }
    }

    private static void printArray(int[][] board) {
        for (int[] row : board) {
            for (int cell : row) {
                System.out.printf("%2d ", cell);
            }
            System.out.println();
        }
    }

    private static boolean helper(int[][] board, int row, int col, int cells) {
        int n = board.length;

        if (row < 0 || col < 0 || row >= n || col >= n || board[row][col] != 0)
            return false;

        board[row][col] = cells;

        if (cells == n * n) return true;

        List<int[]> nextMoves = getSortedMoves(board, row, col);

        for (int[] move : nextMoves) {
            int newRow = move[0];
            int newCol = move[1];
            if (helper(board, newRow, newCol, cells + 1)) return true;
        }

        board[row][col] = 0; // Backtrack
        return false;
    }

    // Warnsdorff's Rule: Move to the square with fewest onward moves
    private static List<int[]> getSortedMoves(int[][] board, int row, int col) {
        int n = board.length;
        List<int[]> moves = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];

            if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < n && board[newRow][newCol] == 0) {
                int count = countOnwardMoves(board, newRow, newCol);
                moves.add(new int[] { newRow, newCol, count });
            }
        }

        // Sort by increasing number of onward moves (Warnsdorff)
        moves.sort(Comparator.comparingInt(a -> a[2]));

        // Remove the move count from final list (keep only coordinates)
        List<int[]> sorted = new ArrayList<>();
        for (int[] move : moves) {
            sorted.add(new int[] { move[0], move[1] });
        }

        return sorted;
    }

    private static int countOnwardMoves(int[][] board, int row, int col) {
        int n = board.length;
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int newRow = row + dx[i];
            int newCol = col + dy[i];
            if (newRow >= 0 && newCol >= 0 && newRow < n && newCol < n && board[newRow][newCol] == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the chess board: ");
        int n = sc.nextInt();
        canFinish(n);
    }
}
