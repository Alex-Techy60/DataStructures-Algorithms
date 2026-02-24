import java.util.*;

public class Rat_Maze {
    static char[] moves = { 'L', 'R', 'D', 'U' };

    public static ArrayList<String> findPath(int[][] maze) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        helper(maze, 0, 0, result, sb);
        return result;
    }

    private static void helper(int[][] maze, int row, int col, ArrayList<String> result, StringBuilder sb) {
        int n = maze.length;
        if (row == n - 1 && col == n - 1) {
            result.add(sb.toString());
            return;
        }
        if (row >= n || col >= n || row < 0 || col < 0 || maze[row][col] == 0) {
            return;
        }
        maze[row][col] = 0;
        for (int i = 0; i < 4; i++) {
            sb.append(moves[i]);
            switch(moves[i]){
                case 'L': helper(maze, row, col-1, result, sb);
                break;
                case 'R': helper(maze, row, col+1, result, sb);
                break;
                case 'U': helper(maze, row-1, col, result, sb);
                break;
                case 'D': helper(maze, row+1, col, result, sb);
                break;
                default: return;
            }
            sb.deleteCharAt(sb.length() - 1);
        }
        maze[row][col] = 1;
        return;
    }

    public static void main(String[] args) {
        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 1, 1, 0, 0 },
                { 0, 1, 1, 1 }
        };
        System.out.println(findPath(maze));
    }
}