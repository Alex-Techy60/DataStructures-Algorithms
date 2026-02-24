import java.io.*;
import java.util.*;

public class Main {
    static final int MSB = 30; // process bits 30..0

    static class Parent {
        int prevPx, prevQy;
        int pbit, qbit;
        Parent(int a, int b, int c, int d) { prevPx = a; prevQy = b; pbit = c; qbit = d; }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            final long INF = (1L<<62);
            long[][] dpPrev = new long[3][3];
            long[][] dpCur  = new long[3][3];
            for (int i=0;i<3;i++) for (int j=0;j<3;j++) dpPrev[i][j] = INF;
            dpPrev[0][0] = 0L;

            Parent[][][] parent = new Parent[MSB+1][3][3];

            for (int pos = MSB; pos >= 0; pos--) {
                for (int i=0;i<3;i++) for (int j=0;j<3;j++) dpCur[i][j] = INF;
                int xbit = (x >> pos) & 1;
                int ybit = (y >> pos) & 1;
                for (int px = 0; px < 3; px++) {
                    for (int qy = 0; qy < 3; qy++) {
                        long base = dpPrev[px][qy];
                        if (base >= INF) continue;
                        for (int pbit = 0; pbit <= 1; pbit++) {
                            for (int qbit = 0; qbit <= 1; qbit++) {
                                if ((pbit & qbit) != 0) continue;
                                int npx = px;
                                if (px == 0) {
                                    if (pbit < xbit) npx = 1;
                                    else if (pbit > xbit) npx = 2;
                                    else npx = 0;
                                }
                                int nqy = qy;
                                if (qy == 0) {
                                    if (qbit < ybit) nqy = 1;
                                    else if (qbit > ybit) nqy = 2;
                                    else nqy = 0;
                                }
                                long add = ((long)Math.abs(xbit - pbit) + (long)Math.abs(ybit - qbit)) << pos;
                                long cand = base + add;
                                if (cand < dpCur[npx][nqy]) {
                                    dpCur[npx][nqy] = cand;
                                    parent[pos][npx][nqy] = new Parent(px, qy, pbit, qbit);
                                }
                            }
                        }
                    }
                }
                // swap dpPrev and dpCur (copy)
                for (int i=0;i<3;i++) for (int j=0;j<3;j++) dpPrev[i][j] = dpCur[i][j];
            }

            // find best final state
            long best = INF;
            int bestPx = 0, bestQy = 0;
            for (int px = 0; px < 3; px++) {
                for (int qy = 0; qy < 3; qy++) {
                    if (dpPrev[px][qy] < best) {
                        best = dpPrev[px][qy];
                        bestPx = px; bestQy = qy;
                    }
                }
            }

            // reconstruct bits from pos=0..MSB (we stored parent at each pos when we transitioned INTO that pos's new state)
            long p = 0L, q = 0L;
            int curPx = bestPx, curQy = bestQy;
            for (int pos = 0; pos <= MSB; pos++) {
                Parent par = parent[pos][curPx][curQy];
                // should never be null for the chosen final path
                int pbit = par.pbit;
                int qbit = par.qbit;
                if (pbit == 1) p |= (1L << pos);
                if (qbit == 1) q |= (1L << pos);
                int prevPx = par.prevPx;
                int prevQy = par.prevQy;
                curPx = prevPx;
                curQy = prevQy;
            }

            sb.append(p).append(' ').append(q).append('\n');
        }
        System.out.print(sb.toString());
    }
}
