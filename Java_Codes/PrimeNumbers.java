import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:-");
        int n = sc.nextInt();
        boolean[] notPrime = new boolean[n+1];
        findPrimes(notPrime);
        for(int i=0; i<=n; i++){
            if(!notPrime[i]){
                System.out.println(i);
            }
        }
    }
    public static void findPrimes(boolean[] notPrime){
        int n = notPrime.length;
        notPrime[0] = true;
        notPrime[1] = true;
        for(int i=2; i*i<n; i++){
            if(notPrime[i]){
                continue;
            }
            for(int j=2*i; j<n; j += i){
                notPrime[j] = true;
            }
        }
    }
}
