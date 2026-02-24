import java.util.Scanner;

public class SquareRoot {
    public static double sqrt(int n, int p) {
        double result = 0;
        int start = 1;
        int end = n;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid * mid == n) {
                return mid;
            } else if (mid * mid < n) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        result = end;
        double incr = 1;
        for(int i=0; i<p; i++){
            incr /= 10;
            while(result * result < n){
                
                result += incr;
            }
            result -= incr;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println("Enter the precision you want");
        int p = sc.nextInt();
        double result = sqrt(n, p);
        System.out.printf("%9f", result);
    }
}
