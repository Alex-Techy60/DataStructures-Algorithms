import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());

            long[] a = new long[n + 1];
            long total = 0;

            st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                a[i] = Long.parseLong(st.nextToken());
                total += a[i];
            }

            long[] pref = new long[n + 1];
            long[] prefMin = new long[n + 1];
            long curMin = Long.MAX_VALUE;

            for (int i = 1; i <= n; i++) {
                pref[i] = pref[i - 1] + a[i];
                curMin = Math.min(curMin, a[i]);
                prefMin[i] = curMin;
            }

            long[] suffixMax = new long[n + 1];
            long curMax = Long.MIN_VALUE;

            for (int i = n - 1; i >= 1; i--) {
                curMax = Math.max(curMax, a[i + 1]);
                suffixMax[i] = curMax;
            }

            long ans = Long.MAX_VALUE;

            for (int r = 1; r <= n; r++) {
                long best = pref[r];

                if (r < n) {
                    long candidate = pref[r] - prefMin[r] + suffixMax[r];
                    if (candidate > best) best = candidate;
                }

                long q;
                if (best >= h) {
                    q = 0;
                } else {
                    long need = h - best;
                    q = (need + total - 1) / total;
                }

                long time = q * (n + k) + r;
                ans = Math.min(ans, time);
            }

            System.out.println(ans);
        }
    }
}   