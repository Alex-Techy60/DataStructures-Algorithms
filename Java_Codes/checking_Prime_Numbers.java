import java.util.*;

public class checking_Prime_Numbers {
    public static void checkingPrimeNumbers(int n) {
        int factors = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                factors++;
            }
        }
        if (factors == 2) {
            System.out.println("The given number " + n + " is prime");
        } else if (factors > 2) {
            System.out.println("The given number " + n + " is composite");
        } else {
            System.out.println("The given number " + n + " is neither prime nor composite");
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll predict whether it is prime or not");
        int n = sc.nextInt();
        checkingPrimeNumbers(Math.abs(n));
    }
}
