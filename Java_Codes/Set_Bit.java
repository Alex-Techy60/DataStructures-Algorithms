import java.util.*;

public class Set_Bit {
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
        String str = "";
        for(int i=0; i<sb.length(); i++){
            str += sb.charAt(i);
        }
        return Integer.parseInt(str);
    }
    public static int setBit(int n, int pos){
        String str = Integer.toString(decToBin(n));
        int newpos = str.length()-1-pos;
        int bitMask = 1<<newpos;
        int newNumber = n | bitMask;
        return newNumber;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        System.out.println("Enter the position, you wanna set bit to 1");
        int pos = sc.nextInt();
        System.out.println("The new number is :  " + setBit(n, pos-1));
    }
}
