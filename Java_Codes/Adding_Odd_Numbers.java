import java.util.*;
public class Adding_Odd_Numbers {
    public static int addOddNumbers(int n, int sum){
        if(n == -1){
            return sum;
        }
        if(n%2==0){
            n--;
        }
        return addOddNumbers(n-2, sum+n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll give you the sum of odd numbers upto it");
        int n = sc.nextInt();
        System.out.println("The sum of odd numbers upto " + n + " is " + addOddNumbersOptimized(n));
    }
    public static int addOddNumbersOptimized(int n){
        int temp = (n / 2) + (n % 2);
        int result = getSquare(temp);
        return result;
    }
    private static int getSquare(int n){
        return n*n;
    }
}