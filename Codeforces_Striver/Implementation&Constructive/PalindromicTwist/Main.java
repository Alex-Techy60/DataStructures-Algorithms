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
            boolean result = true;
            for(int i=0; i<n; i++) {
                char ch1 = s.charAt(i);
                char ch2 = s.charAt(n-i-1);
                int diff = Math.abs(ch1 - ch2);
                if(diff == 0 || diff == 2) {
                    continue;
                } else {
                    result = false;
                    break;
                }
            }
            if(result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
