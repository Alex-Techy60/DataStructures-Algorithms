import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            Map<Integer, Integer> freq = new HashMap<>();
            int maxA = 0;

            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                freq.put(a[i], freq.getOrDefault(a[i], 0) + 1);
                maxA = Math.max(maxA, a[i]);
            }

            // Count distinct multiples for each divisor
            Map<Integer, Integer> multipleCount = new HashMap<>();

            for (int x : freq.keySet()) {
                for (int d = 1; (long) d * d <= x; d++) {
                    if (x % d == 0) {
                        // d is a divisor
                        multipleCount.put(d, multipleCount.getOrDefault(d, 0) + 1);

                        int other = x / d;
                        if (other != d) {
                            multipleCount.put(other, multipleCount.getOrDefault(other, 0) + 1);
                        }
                    }
                }
            }

            // Find valid candidates b
            List<Integer> valid = new ArrayList<>();
            for (int b : multipleCount.keySet()) {
                long need = k / b;      // how many multiples <= k
                long needMax = maxA / b; // how many multiples <= maxA

                // there must be no extra multiples between maxA+1 and k
                if (need != needMax) continue;

                int haveDistinct = multipleCount.get(b); // distinct multiples in array
                if (haveDistinct == need) {
                    valid.add(b);
                }
            }

            if (valid.isEmpty()) {
                System.out.println(-1);
                continue;
            }

            Collections.sort(valid); // small b first

            boolean[] covered = new boolean[n];
            int coveredCnt = 0;
            List<Integer> B = new ArrayList<>();

            for (int b : valid) {
                boolean needed = false;

                // check if b helps cover any new element
                for (int i = 0; i < n; i++) {
                    if (!covered[i] && a[i] % b == 0) {
                        needed = true;
                        break;
                    }
                }

                if (!needed) continue;

                B.add(b);

                for (int i = 0; i < n; i++) {
                    if (!covered[i] && a[i] % b == 0) {
                        covered[i] = true;
                        coveredCnt++;
                    }
                }

                if (coveredCnt == n) break;
            }

            if (coveredCnt != n) {
                System.out.println(-1);
            } else {
                System.out.println(B.size());
                for (int i = 0; i < B.size(); i++) {
                    System.out.print(B.get(i));
                    if (i + 1 < B.size()) System.out.print(" ");
                }
                System.out.println();
            }
        }
    }
}
