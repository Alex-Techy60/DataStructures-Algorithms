import java.util.*;

public class Clear_Bit {
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
    public static int clearBit(int n, int pos){
        String str = Integer.toString(decToBin(n));
        int newPos = str.length()-1-pos;
        int bitMask = 1<<newPos;
        int newBitMask = ~(bitMask);
        return (newBitMask&n);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("Enter the position you wanna clear the bit to 0");
        int pos = sc.nextInt();
        System.out.println("The new number is :  " + clearBit(n, pos-1));
    }
}
