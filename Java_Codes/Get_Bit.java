import java.util.*;

public class Get_Bit {
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
    public static boolean  getBit(int n, int pos){
        int bin = decToBin(n);
        String str = Integer.toString(bin);
        int truePos = str.length()-1-pos;
        int bitMask = 1<<truePos;
        if((bitMask & n) == 0){
            return false;
        } else{
            return true;
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("Enter your position");
        int pos = sc.nextInt();
        if(getBit(n, pos-1)){
            System.out.println("The bit at given position was 1");
        } else{
            System.out.println("The bit at given position was 0");
        }
    }
}
