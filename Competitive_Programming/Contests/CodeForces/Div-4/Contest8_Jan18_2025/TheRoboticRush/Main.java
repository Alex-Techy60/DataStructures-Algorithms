import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {

    static int lowerBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] < x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    static int upperBound(long[] arr, long x) {
        int l = 0, r = arr.length;
        while (l < r) {
            int mid = (l + r) >>> 1;
            if (arr[mid] <= x) l = mid + 1;
            else r = mid;
        }
        return l;
    }

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            long[] robots = new long[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                robots[i] = Long.parseLong(st.nextToken());
            }

            long[] spikes = new long[m];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < m; i++) {
                spikes[i] = Long.parseLong(st.nextToken());
            }
            Arrays.sort(spikes);

            String s = br.readLine();

            int base = k;
            int big = k + 5;
            int[] first = new int[2 * k + 1];
            Arrays.fill(first, big);

            int cur = 0;
            for (int i = 0; i < k; i++) {
                cur += (s.charAt(i) == 'L' ? -1 : 1);
                int id = cur + base;
                if (first[id] == big) {
                    first[id] = i + 1;
                }
            }

            int[] dead = new int[k + 2];

            for (long a : robots) {
                long lo = a - k;
                long hi = a + k;

                int l = lowerBound(spikes, lo);
                int r = upperBound(spikes, hi) - 1;

                int dieAt = big;
                for (int i = l; i <= r; i++) {
                    int need = (int)(spikes[i] - a);
                    int t = first[need + base];
                    if (t < dieAt) dieAt = t;
                }

                if (dieAt <= k) {
                    dead[dieAt]++;
                }
            }

            int alive = n;
            int[] result = new int[k];
            for (int i = 1; i <= k; i++) {
                alive -= dead[i];
                result[i - 1] = alive;
            }

            for (int i = 0; i < k - 1; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(result[k - 1]);
        }
    }
}