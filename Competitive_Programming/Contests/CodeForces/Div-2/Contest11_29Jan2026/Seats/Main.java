import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            
            int ones = 0;
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == '1') ones++;
            }
            
            if(ones == 0) {
                System.out.println((n+2)/3);
                continue;
            }
            
            int firstOne = -1;
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == '1') {
                    firstOne = i;
                    break;
                }
            }
            
            int lastOne = -1;
            for(int i=n-1; i>=0; i--) {
                if(s.charAt(i) == '1') {
                    lastOne = i;
                    break;
                }
            }
            
            int result = ones;
            
            int prefixZeros = firstOne;
            result += (prefixZeros + 1) / 3;
            
            int suffixZeros = n - lastOne - 1;
            result += (suffixZeros + 1) / 3;
            
            int zeros = 0;
            int prevOne = firstOne;
            for(int i=firstOne+1; i<=lastOne; i++) {
                if(s.charAt(i) == '1') {
                    int segmentZeros = i - prevOne - 1;
                    result += segmentZeros / 3;
                    prevOne = i;
                }
            }
            
            System.out.println(result);
        }
    }
}