import java.util.*;
public class Transpose_matrix {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter the element at " + i + "," + j +" position");
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Your given matrix is :-  ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int[][] transpose = new int[3][3];
        System.out.println("It's transpose is :-  ");
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                transpose[i][j] = matrix[j][i];
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
    }
}