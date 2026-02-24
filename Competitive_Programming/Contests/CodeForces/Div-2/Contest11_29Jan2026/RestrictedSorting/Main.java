import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            int ones = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') ones++;
            }
            
            if (ones == 0) {
                System.out.println((n + 1) / 2);
                continue;
            }
            
            int result = ones;
            int zeros = 0;
            
            // Handle prefix zeros
            int firstOne = s.indexOf('1');
            result += firstOne / 2;
            
            // Handle suffix zeros
            int lastOne = s.lastIndexOf('1');
            result += (n - lastOne - 1) / 2;
            
            // Handle zeros between 1s
            zeros = 0;
            for (int i = firstOne + 1; i <= lastOne; i++) {
                if (s.charAt(i) == '0') {
                    zeros++;
                } else {
                    result += (zeros - 1) / 2;
                    zeros = 0;
                }
            }
            result += (zeros - 1) / 2;
            
            System.out.println(result);
        }
    }
}