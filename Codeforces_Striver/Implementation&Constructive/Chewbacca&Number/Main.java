import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = num.length();
        for(int i=0; i<n; i++){
            int digit = num.charAt(i) - '0';
            if(i == 0 && digit == 9){
                sb.append(digit);
            } else{
                sb.append((digit > 4) ? 9 - digit : digit);
            }
        }
        System.out.println(sb);
    }
}
