import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String s = br.readLine().trim();
            String t = br.readLine().trim();
            int n = s.length();
            int m = t.length();
            int[] cntS = new int[26];
            int[] cntT = new int[26];

            for (int i = 0; i < n; i++) {
                cntS[s.charAt(i) - 'a']++;
            }
            for (int i = 0; i < m; i++) {
                cntT[t.charAt(i) - 'a']++;
            }
            boolean ok = true;
            for (int i = 0; i < 26; i++) {
                if (cntS[i] > cntT[i]) {
                    ok = false;
                    break;
                }
            }
            if (!ok) {
                out.append("Impossible\n");
                continue;
            }
            int[][] pref = new int[n + 1][26];
            for (int i = 1; i <= n; i++) {
                System.arraycopy(pref[i - 1], 0, pref[i], 0, 26);
                pref[i][s.charAt(i - 1) - 'a']++;
            }
            int[] remaining = Arrays.copyOf(cntT, 26);
            StringBuilder ans = new StringBuilder();
            int k = 0;
            for (int pos = 0; pos < m; pos++) {
                boolean placed = false;
                for (int c = 0; c < 26; c++) {
                    if (remaining[c] == 0) continue;
                    remaining[c]--;
                    int k2 = k;
                    if (k2 < n && c == s.charAt(k2) - 'a') {
                        k2++;
                    }
                    boolean possible = true;
                    for (int x = 0; x < 26; x++) {
                        int need = cntS[x] - pref[k2][x];
                        if (remaining[x] < need) {
                            possible = false;
                            break;
                        }
                    }
                    if (possible) {
                        ans.append((char) ('a' + c));
                        k = k2;
                        placed = true;
                        break;
                    } else {
                        remaining[c]++;
                    }
                }
                if (!placed) {
                    ans.setLength(0);
                    ans.append("Impossible");
                    break;
                }
            }
            if (!ans.toString().equals("Impossible") && k != n) {
                out.append("Impossible\n");
            } else {
                out.append(ans).append('\n');
            }
        }
        System.out.print(out.toString());
    }
}
