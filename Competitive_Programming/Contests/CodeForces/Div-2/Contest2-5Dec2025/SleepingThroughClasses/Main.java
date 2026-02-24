import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine();
            int awake = k;
            int count = 0;
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == '1') {
                    awake = 0;
                } else {
                    if(awake >= k) {
                        count++;
                    }
                    awake++;
                }
            }
            System.out.println(count);
        }
    }
}