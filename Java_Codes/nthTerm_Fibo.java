import java.util.Scanner;

public class nthTerm_Fibo {
    public static int fibo(int n, int a, int b){
        if(n==0){
            return 0;
        } else if(n==1){
            return a;
        } else if(n==2) {
            return b;
        }
        int term = fibo(n-1, a, b)+fibo(n-2, a, b);
        return term;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term you wanna know in the fibonacci series");
        int n = sc.nextInt();
        System.out.println("Enter the first term");
        int a = sc.nextInt();
        System.out.println("Enter the second term");
        int b = sc.nextInt();
        int term = fibo(n, a, b);
        if(n%10 == 1 && n%100 != 11){
            System.out.println("The " + n + "st term in the series is :  " + term);
        } else if(n%10 == 2 && n%100 != 12){
            System.out.println("The " + n + "nd term in the series is :  " + term);
        } else if(n%10 == 3 && n%100 != 13){
            System.out.println("The " + n + "rd term in the series is :  " + term);
        } else {
            System.out.println("The " + n + "th term in the series is :  " + term);
        }
        
    }
}

