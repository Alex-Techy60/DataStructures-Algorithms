import java.util.Scanner;

public class Matrix_Multiplication {
    public static void matrixMultiplication(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows in the first matrix");
        int r1 = sc.nextInt();
        System.out.println("Enter the number of columns in the first matrix");
        int c1 = sc.nextInt();
        System.out.println("Enter the number of rows in the second matrix");
        int r2 = sc.nextInt();
        System.out.println("Enter the number of columns in the second matrix");
        int c2 = sc.nextInt();
        if(c1 != r2){
            System.out.println("Matrix multiplication is not possible for the matrices of this order");
            return;
        } 
        int[][] matrix1 = new int[r1][c1];
        int[][] matrix2 = new int[r2][c2];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.println("Enter the element in the first matrix at position :  " + i + "," + j);
                matrix1[i][j]= sc.nextInt();
            }
        }
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                System.out.println("Enter the element in the second matrix at position :  " + i + "," + j);
                matrix2[i][j]= sc.nextInt();
            }
        }
        System.out.println("Your first matrix is :  ");
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                System.out.print(matrix1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Your Second matrix is :  ");
        for(int i=0; i<r2; i++){
            for(int j=0; j<c2; j++){
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("And their multiplication is :  ");
        int[][] product = new int[r1][c2];
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                int sum = 0;
                for (int k = 0; k < c1; k++) {
                    sum += matrix1[i][k] * matrix2[k][j];
                }
                product[i][j] = sum;
            }
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                System.out.print(product[i][j] + "  ");
            }
            System.out.println();
        }                
    }
    public static void main(String args[]){
        matrixMultiplication();
    }
} 