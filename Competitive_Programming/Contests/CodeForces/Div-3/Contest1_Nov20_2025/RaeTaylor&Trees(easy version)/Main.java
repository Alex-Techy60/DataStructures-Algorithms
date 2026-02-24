import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] p = new int[n + 1];
            int[] pos = new int[n + 1];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 1; i <= n; i++) {
                p[i] = Integer.parseInt(st.nextToken());
                pos[p[i]] = i;
            }

            int[] prefMin = new int[n + 1];
            int[] suffMax = new int[n + 2];

            int curMin = Integer.MAX_VALUE;
            for (int k = 1; k <= n; k++) {
                curMin = Math.min(curMin, pos[k]);
                prefMin[k] = curMin;
            }

            int curMax = -1;
            for (int k = n; k >= 1; k--) {
                curMax = Math.max(curMax, pos[k]);
                suffMax[k] = curMax;
            }

            boolean ok = true;
            for (int k = 1; k <= n - 1; k++) {
                if (prefMin[k] > suffMax[k + 1]) {
                    ok = false;
                    break;
                }
            }

            out.append(ok ? "Yes\n" : "No\n");
        }

        System.out.print(out.toString());
    }
}
