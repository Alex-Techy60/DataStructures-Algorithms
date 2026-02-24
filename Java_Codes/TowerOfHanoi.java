import java.util.Scanner;

public class TowerOfHanoi {
    public static void toh(int n, String src, String help, String dest){
        if(n==0){
            return;
        } else if(n == 1){
            System.out.println("Transfer a disc from " + src + " to " + dest);
            return;
        } 
        toh(n-1, src, dest, help);
        System.out.println("Transfer a disc from " + src + " to " + dest);
        toh(n-1, help, src, dest);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will tell you the steps to transfer a number of disc from source to destination using helper, this is called the tower of hanoi");
        System.out.println("Enter the number of disc");
        int n = sc.nextInt();
        toh(n, "Source", "Helper", "Destination");
    }
}
