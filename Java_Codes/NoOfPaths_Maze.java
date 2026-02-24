import java.util.Scanner;

public class NoOfPaths_Maze {
    public static int c = 0;
    public static int countPaths(int i, int j, int m, int n){
        if(i==m+1 || j==n+1){
            return 0;
        }
        if(i==m && j==n){
            return 1;
        }
        int horpaths = countPaths(i+1, j, m, n);
        int verpaths = countPaths(i, j+1, m, n);
        return horpaths+verpaths;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will give you the number of ways to reach the final destination in an open maze");
        System.out.println("Enter the number of rows");
        int m = sc.nextInt();
        System.out.println("Enter the number of columns");
        int n = sc.nextInt();
        int paths = countPaths(1, 1, m, n);
        System.out.println("The total number of ways are :  " + paths);
    }   
}
