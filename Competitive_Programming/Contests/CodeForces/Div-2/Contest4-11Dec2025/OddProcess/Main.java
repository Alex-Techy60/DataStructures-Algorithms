import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {

            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) arr[i] = Integer.parseInt(st.nextToken());
            Arrays.sort(arr); // ascending

            // Split into even and odd
            List<Integer> even = new ArrayList<>();
            List<Integer> odd = new ArrayList<>();
            for (int x : arr) {
                if ((x & 1) == 0) even.add(x);
                else odd.add(x);
            }

            long[] result = new long[n];
            Arrays.fill(result, 0L);

            int e = even.size();
            int o = odd.size();

            // Handle trivial cases
            if (o == 0) {
                // all evens -> bag always flushes -> all zeros
                for (int i = 0; i < n; i++) result[i] = 0;
                print(result);
                continue;
            }

            if (e == 0) {
                // only odds -> alternating odd/0 pattern
                long largestOdd = odd.get(o - 1);
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) result[i] = largestOdd;
                    else result[i] = 0;
                }
                print(result);
                continue;
            }

            // ------- YOUR ORIGINAL CONSTRUCTION -------
            int idx = 0;
            long sum = odd.get(o - 1);
            result[idx++] = sum;

            // add evens largest→smallest
            for (int i = e - 1; i >= 0 && idx < n; i--) {
                sum += even.get(i);
                result[idx++] = sum;
            }

            boolean oddTurn = false;
            int smallestEven = even.get(0);
            int pairs = (o - 1) / 2;

            // alternating pattern
            for (int p = 0; p < pairs && idx < n; p++) {

                if (!oddTurn && idx < n) {
                    result[idx++] = sum - smallestEven;
                } else if (idx < n) {
                    result[idx++] = sum;
                }
                oddTurn = !oddTurn;

                if (idx < n) {
                    result[idx++] = result[idx - 2] + smallestEven;
                }
            }

            while (idx < n) {
                if (!oddTurn) result[idx++] = sum - smallestEven;
                else result[idx++] = sum;
                oddTurn = !oddTurn;
            }

            if (o % 2 == 0) {
                result[n - 1] = 0;
            }

            // ------- FIX PART: REPLACE RESULT WITH TRUE REACHABLE MAX VALUES -------

            // reverse arr to get descending for prefix logic
            reverse(arr);
            long[] pref = new long[n];
            pref[0] = arr[0];
            for (int i = 1; i < n; i++) pref[i] = pref[i - 1] + arr[i];

            // find smallest odd/even inside prefix and largest odd/even outside
            long[] minOdd = new long[n];
            long[] minEven = new long[n];
            long INF = (long)1e18;
            long curMinOdd = INF, curMinEven = INF;

            for (int i = 0; i < n; i++) {
                if ((arr[i] & 1) == 1) curMinOdd = Math.min(curMinOdd, arr[i]);
                else curMinEven = Math.min(curMinEven, arr[i]);

                minOdd[i] = curMinOdd;
                minEven[i] = curMinEven;
            }

            long[] maxOddSuf = new long[n + 1];
            long[] maxEvenSuf = new long[n + 1];
            Arrays.fill(maxOddSuf, -INF);
            Arrays.fill(maxEvenSuf, -INF);

            long curMaxOdd = -INF, curMaxEven = -INF;
            for (int i = n - 1; i >= 0; i--) {
                if ((arr[i] & 1) == 1) curMaxOdd = Math.max(curMaxOdd, arr[i]);
                else curMaxEven = Math.max(curMaxEven, arr[i]);

                maxOddSuf[i] = curMaxOdd;
                maxEvenSuf[i] = curMaxEven;
            }

            // correct your result using reachable odd-prefix rule
            long[] finalAns = new long[n];
            for (int k = 1; k <= n; k++) {
                long prefixSum = pref[k - 1];

                long best = 0;
                if ((prefixSum & 1) == 1) {
                    best = prefixSum;
                } else {
                    long attempt1 = 0, attempt2 = 0;

                    if (minOdd[k - 1] < INF) {
                        attempt1 = prefixSum - minOdd[k - 1];
                    }
                    if (minEven[k - 1] < INF && maxOddSuf[k] > -INF) {
                        attempt2 = prefixSum - minEven[k - 1] + maxOddSuf[k];
                    }

                    best = Math.max(0L, Math.max(attempt1, attempt2));
                }

                finalAns[k - 1] = Math.min(result[k - 1], best);
            }

            print(finalAns);
        }
    }

    static void print(long[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i + 1 < arr.length) sb.append(" ");
        }
        System.out.println(sb.toString());
    }

    static void reverse(int[] arr) {
        int i = 0, j = arr.length - 1;
        while (i < j) {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
            i++; j--;
        }
    }
}
