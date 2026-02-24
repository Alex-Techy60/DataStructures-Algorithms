import java.util.*;
public class Fibonaccci_Series {
    public static void printFibonacci(int n, int a, int b){
        if(n==0){
            return;
        }
        System.out.println(a + " ");
        printFibonacci(n-1, b, a+b);
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a number n");
        int n = sc.nextInt();
        printFibonacci(n, 0, 1);
    }
}
