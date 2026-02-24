import java.util.*;

public class Decimal_to_Binary {
    public static int decToBin(int n){
        StringBuilder sb = new StringBuilder("");

        while(n>=1){
            int a = n%2;
            sb.append(a);
            n /= 2;
        }
        for(int i=0; i<sb.length()/2; i++){
            char cr = sb.charAt(i);
            sb.setCharAt(i,sb.charAt(sb.length()-1-i));
            sb.setCharAt(sb.length()-1-i,cr);
        }
        return Integer.parseInt(sb.toString());
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I'll give you it's decimal value");
        int n = sc.nextInt();
        System.out.println("The decimal value of " + n + " is : " + decToBin(n));
    }
}
