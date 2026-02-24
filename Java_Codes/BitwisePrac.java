import java.util.Scanner;

public class BitwisePrac {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        // int[] arr = {2, 3, 4, 3, 2, 4, 6};
        // System.out.println(uniqueNum(arr));
        // int dummy = sc.nextInt();
        System.out.println(rightMostSetBit(sc.nextInt()));
    }
    public static boolean isEven(int n){
        return (n&1) == 0;
    }
    public static int uniqueNum(int[] arr){
        int unique = 0;
        for(int i: arr){
            unique ^= i;
        }
        return unique;
    }
    public static int getBit(int n, int i){
        if(i<1){
            return -1;
        }
        int bitMask = 1<<(i-1);
        
        if((bitMask&n) == 0){
            return 0;
        } else{
            return 1;
        }
    }
    public static int setBit(int n, int i){
        if(i<1){
            return -1;
        }
        int bitMask = 1<<(i-1);
        int result = bitMask|n;
        return result;
    }
    public static int resetBit(int n, int i){
        if(i<1){
            return -1;
        }
        int bitMask = 1<<(i-1);
        int result = n & (~bitMask);
        return result;
    }
    public static int rightMostSetBit(int n){
        int bitMask = 1;
        int count = 1;
        while(bitMask <= n){
            if((bitMask&n) == 1){
                return count;
            }
            bitMask <<= 1;
            count++;
        }
        return -1;
    }
}
