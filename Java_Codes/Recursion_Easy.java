import java.util.Scanner;

public class Recursion_Easy {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return ((n % 10) + sumOfDigits(n / 10));
    }

    public static int productOfDigits(int n) {
        if (n < 10) {
            return n;
        }
        return ((n % 10) * productOfDigits(n / 10));
    }

    public static int reverseNumber(int n) {
        int digits = (int) Math.log10(n) + 1;
        return reverseHelper(n, digits);
    }

    private static int reverseHelper(int n, int digits) {
        if (n < 10)
            return n;
        return (n % 10) * (int) Math.pow(10, digits - 1) + reverseHelper(n / 10, digits - 1);
    }
    public static boolean isPalindrome(int n){
        return (n == reverseNumber(n));
    }
    public static int countZeros(int n){
        if(n == 0){
            return 1;
        }
        if(n < 10){
            return 0;
        }
        int curr = ((n % 10) == 0) ? 1 : 0;
        return curr + countZeros(n / 10);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a no. ");
        int n = sc.nextInt();
        System.out.println("The product of it's digits are:-");
        System.out.println(productOfDigits(n));
        System.out.println("The sum of it's digits are:-");
        System.out.println(sumOfDigits(n));
        System.out.println("It's reverse is:-");
        System.out.println(reverseNumber(n));
        if(isPalindrome(n)){
            System.out.println("The number is a palindrome");
        } else{
            System.out.println("The number is not a palindrome");
        }
        System.out.println("Total no. of zeros in this no is:-");
        System.out.println(countZeros(n));
    }
}
