import java.util.Scanner;

public class Alex {
    public static void main(String[] args) {
        System.out.println("Enter the total number of discs in the source tower");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        toh(n, "Source", "Helper", "Destination");
    }
    public static void toh(int n, String src, String help, String dest) {
        if(n == 0) {
            return;
        }
        if(n == 1) {
            System.out.println("Transfer disk number " + n + " from " + src + " tower to the " + dest + " tower");
            return;
        }
        toh(n-1, src, dest, help);
        System.out.println("Transfer disk number " + n + " from " + src + " tower to the " + dest + " tower");
        toh(n-1, help, src, dest);
    }

}
