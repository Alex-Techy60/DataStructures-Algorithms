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
            int blocks = 1;
            for(int i=1; i<n; i++) {
                if(s.charAt(i) != s.charAt(i-1)) {
                    blocks++;
                }
            }
            if(n > 2) {
                if(blocks > 1 && blocks < n) {
                    if(s.charAt(0) != s.charAt(n-1)) {
                        blocks++;
                    }
                }
            }
            System.out.println(blocks);
        }
    }
}