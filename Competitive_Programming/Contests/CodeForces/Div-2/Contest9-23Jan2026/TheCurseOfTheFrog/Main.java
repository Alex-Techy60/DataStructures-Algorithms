import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long base = 0L;
            long maxGainPerRollback = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                long a = Long.parseLong(st.nextToken());
                long b = Long.parseLong(st.nextToken());
                long c = Long.parseLong(st.nextToken());
                base += (b - 1L) * a;
                long gain = b * a - c;
                if (gain > maxGainPerRollback) maxGainPerRollback = gain;
            }
            if (base >= x) {
                System.out.println(0);
                continue;
            }
            if (maxGainPerRollback <= 0) {
                System.out.println(-1);
                continue;
            }
            long need = x - base;
            long result = (need + maxGainPerRollback - 1) / maxGainPerRollback;
            System.out.println(result);
        }
    }
}
