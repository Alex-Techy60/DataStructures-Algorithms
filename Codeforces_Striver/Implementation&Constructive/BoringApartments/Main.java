import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int result = 0;
            String s = br.readLine();
            int digit = s.charAt(0) - '0';
            result += 10 * (digit-1);
            int n = s.length();
            result += (n * (n+1)) / 2;
            System.out.println(result);
        }
    }
}
