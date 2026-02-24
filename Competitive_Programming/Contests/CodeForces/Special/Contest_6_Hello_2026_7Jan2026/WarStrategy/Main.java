import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long m = Long.parseLong(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int leftDist = k - 1;
            int rightDist = n - k;

            int lo = 1, hi = n, ans = 1;
            while (lo <= hi) {
                int mid = (lo + hi) / 2;
                if (check(mid, m, leftDist, rightDist)) {
                    ans = mid;
                    lo = mid + 1;
                } else {
                    hi = mid - 1;
                }
            }
            pw.println(ans);
        }
        pw.flush();
    }

    static boolean check(int X, long m, int leftDist, int rightDist) {
        int T = X - 1;
        int a_low = Math.max(0, T - rightDist);
        int a_high = Math.min(T, leftDist);
        if (a_low > a_high) return false;

        long minNeed = Long.MAX_VALUE;
        minNeed = Math.min(computeNeed(a_low, T), computeNeed(a_high, T));

        double vertex = T / 2.0;
        int c1 = (int) Math.floor(vertex);
        int c2 = (int) Math.ceil(vertex);
        if (c1 >= a_low && c1 <= a_high)
            minNeed = Math.min(minNeed, computeNeed(c1, T));
        if (c2 >= a_low && c2 <= a_high)
            minNeed = Math.min(minNeed, computeNeed(c2, T));

        return minNeed <= m;
    }

    static long computeNeed(int a, int T) {
        long b = T - a;
        return (long) a * (a + 1) / 2 + (long) b * (b + 1) / 2;
    }
}