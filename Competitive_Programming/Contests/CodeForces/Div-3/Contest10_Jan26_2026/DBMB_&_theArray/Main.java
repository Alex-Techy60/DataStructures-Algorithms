import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int i=0; i<n; i++) {
                sum += Integer.parseInt(st.nextToken());
            }
            if(sum > s) {
                System.out.println("NO");
                continue;
            }
            if((s - sum) % x != 0) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
    }
}