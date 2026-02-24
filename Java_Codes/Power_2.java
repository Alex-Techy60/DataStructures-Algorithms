import java.util.*;

public class Power_2 {
    public static int power(int x, int n){
        if(n==0){
            return 1;
        }
        int temp = power(x, n/2);
        if (n%2 == 0) {
            return temp*temp;
        } else {
            return temp*temp*x;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Thi program will give you the value of x raised to the power n i.e.,(x^n)");
        System.out.println("Enter the value of x");
        int x = sc.nextInt();
        System.out.println("Enter the value of n");
        int n = sc.nextInt();
        System.out.println(x + " raised to the power " + n + " = " + power(x,n));
    }
}


