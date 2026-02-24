import java.util.*;
public class Printing_Tables {
    public static void tables(int n, int i){
        if(i==11){
            System.out.println("Thanks buddy, hope your experience was good");
            return;
        }
        System.out.println(n + "  X  " + i + "  =  " + n*i);
        tables(n, i+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any number and I'll rint its table");
        int n = sc.nextInt();
        tables(n, 1);
    }
}
