import java.util.*;

public class Update_Bit {
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
    public static int updateBit(int n, int pos, int bit){
        String str = Integer.toString(decToBin(n));
        int newPos = str.length()-1-pos;
        int bitMask = 1<<newPos;
        if(bit==1){
            return (bitMask|n);
        } else if(bit==0){
            int newBitMask = ~(bitMask);
            return (newBitMask&n);
        } else {
            System.out.println("Invalid bit");
            return -99999999;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("Enter the position you wanna update");
        int pos = sc.nextInt();
        System.out.println("Enther the value of bit you wanna set at that position, kindly enter only 0 or 1");
        int bit = sc.nextInt();
        System.out.println(updateBit(n, pos-1, bit));
    }
}
