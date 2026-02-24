import java.util.Scanner;
import java.util.ArrayList;

public class Factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        printFactors(n);
    }
    public static void printFactors(int n){
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1; i*i<=n; i++){
            if(n % i == 0){
                System.out.print(i + " ");
                if(n / i != i){
                    list.add(n/i);
                }
            }
        }
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
    }
}