import java.util.Arrays;

public class BinarySearch2DArray {
    public static int[] bin2D(int[][] matrix, int target){
        int row = 0, column = matrix.length-1;
        while(row<matrix.length && column>=0){
            if(matrix[row][column] == target){
                return new int[] {row, column};
            } else if(matrix[row][column] > target){
                column--;
            } else{
                row++;
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String args[]){
        int[][] matrix = {
            {5, 6, 10, 19, 26},
            {9, 12, 15, 24, 29},
            {13, 17, 20, 22, 39},
            {21, 27, 30, 35, 40},
            {23, 28, 32, 38, 44}
        };
        System.out.println(Arrays.toString(bin2D(matrix, 35)));
    }
}
