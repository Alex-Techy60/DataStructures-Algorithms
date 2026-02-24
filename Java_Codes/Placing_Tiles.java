import java.util.Scanner;

public class Placing_Tiles {
    public static int placingTiles(int r, int c, int m, int n) {
        // If the tile doesn't fit in either dimension
        if (r > m || c > n) {
            return 0;
        }
        
        // If the floor is completely covered
        if (m == 0 || n == 0) {
            return 1;
        }

        // Place tile horizontally and vertically
        int hor = placingTiles(r, c, m, n - c);
        int ver = placingTiles(r, c, m - r, n);

        return hor + ver;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will give you the number of ways of placing rXc sized tiles in a mXn floor");
        System.out.println("Enter the length of your tile:");
        int r = sc.nextInt();
        System.out.println("Enter the breadth of your tile:");
        int c = sc.nextInt();
        System.out.println("Enter the length of your floor:");
        int m = sc.nextInt();
        System.out.println("Enter the breadth of your floor:");
        int n = sc.nextInt();
        int ways = placingTiles(r, c, m, n);
        System.out.println("The number of ways are: " + ways);
    }
}
