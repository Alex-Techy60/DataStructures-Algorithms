import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            long[] pref = new long[n];
            st = new StringTokenizer(br.readLine());
            pref[0] = Long.parseLong(st.nextToken());
            for (int i = 1; i < n; i++) {
                long bi = Long.parseLong(st.nextToken());
                pref[i] = bi + pref[i-1];
            }
            Arrays.sort(a);
            long result = 0L;
            for (int i = n - 1; i >= 0; i--) {
                int swords = n - i;
                int levels = completedLevels(pref, swords);
                result = Math.max(result, (long) a[i] * levels);
            }
            System.out.println(result);
        }
    }

    private static int completedLevels(long[] pref, int swords) {
        int l = 0, r = pref.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (pref[mid] <= swords) {
                ans = mid;
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return ans + 1;
    }
}
