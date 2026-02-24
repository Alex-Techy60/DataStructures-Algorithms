import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int start = 0;
            int end = n-1;
            while(start <= end && s.charAt(start) == '0' && s.charAt(end) == '0'){
                start++;
                end--;
            }
            if(n == 1 && s.charAt(0) == '0') {
                System.out.println(1);
                continue;
            }
            int result = 0;
            if(s.charAt(start) == '1') {
                result = Math.max(2 * (n-start), (n+1));
            } else if(s.charAt(end) == '1') {
                result = Math.max(2 * (end+1), (n+1));
            } else {
                result = n;
            }
            System.out.println(result);
        }
    }
}
