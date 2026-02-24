import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String number = br.readLine();
        int n = number.length();
        int count = 0;
        for(int i=0; i<n; i++){
            char ch = number.charAt(i);
            if(ch == '4' || ch == '7'){
                count++;
            }
        }
        if(isLucky(count)){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }
    public static boolean isLucky(int n){
        if(n == 0) return false;
        while(n > 0){
            int digit = n%10;
            if(digit != 4 && digit != 7){
                return false;
            }
            n /= 10;
        }
        return true;
    }
}
