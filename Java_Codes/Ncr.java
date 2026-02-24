import java.util.Scanner;

public class Ncr {
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    public static int ncr(int n, int r){
        if(r>n || r<0 || n<0){
            return -1;
        }
        if(r==0 || r==n){
            return 1;
        }
        return factorial(n)/(factorial(r)*factorial(n-r));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will give you the value of Ncr");
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println("Enter the value of r");
        int r = sc.nextInt();
        System.out.println("The value of Ncr is :  " + ncr(n,r));
    }
}
