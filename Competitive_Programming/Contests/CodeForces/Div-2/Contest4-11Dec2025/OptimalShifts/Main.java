import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            ArrayList<Integer> ones = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') ones.add(i);
            }
            long best = Long.MAX_VALUE;
            if (ones.size() == n) {
                best = 0;
                System.out.println(best);
                continue;
            }
            int m = ones.size();
            int maxGap = 0;
            for (int i = 0; i < m; i++) {
                int cur = ones.get(i);
                int nxt = ones.get((i + 1) % m);
                int gap;
                if (nxt > cur) gap = nxt - cur - 1;
                else gap = (n - cur - 1) + nxt;
                if (gap > maxGap) maxGap = gap;
            }
            if (maxGap == 0) {
                best = 0;
                System.out.println(best);
                continue;
            }
            for (int mOp = 1; mOp <= maxGap; mOp++) {
                int d = (maxGap + mOp - 1) / mOp;
                long cost = 1L * mOp * d;
                if (cost < best) best = cost;
            }
            System.out.println(best);
        }
    }
}
