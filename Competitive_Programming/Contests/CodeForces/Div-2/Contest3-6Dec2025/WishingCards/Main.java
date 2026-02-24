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
            int k = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int i=0; i<n; i++) a[i] = Integer.parseInt(st.nextToken());

            int[] dp = new int[k+1];
            int[] ndp = new int[k+1];

            for(int i=0; i<=k; i++) dp[i] = -(int)1e9;
            dp[0] = 0;

            int mx = 0;
            for(int i=0; i<n; i++) {
                for(int j=0; j<=k; j++) ndp[j] = dp[j] + mx;

                for(int v = mx+1; v <= a[i]; v++) {
                    for(int used = 0; used+v <= k; used++) {
                        int val = dp[used] + v * (n - i);
                        if(val > ndp[used+v]) ndp[used+v] = val;
                    }
                }

                mx = Math.min(a[i], k);
                int[] tmp = dp;
                dp = ndp;
                ndp = tmp;
            }

            int ans = 0;
            for(int i=0; i<=k; i++) if(dp[i] > ans) ans = dp[i];
            System.out.println(ans);
        }
    }
}
