import java.util.*;
public class HCF {
    public static int returnHCF(int a, int b){
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will give you the HCF of two numbers");
        System.out.println("Enter the first number");
        int a = sc.nextInt();
        System.out.println("Enter the second number");
        int b = sc.nextInt();
        System.out.println("The HCF of the numbers "+ a + " and " + b + " is " + returnHCF(a,b));
    }
}