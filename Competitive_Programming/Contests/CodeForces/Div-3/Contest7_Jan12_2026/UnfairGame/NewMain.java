import java.io.*;
import java.util.*;

public class NewMain {

    static long[][] C = new long[64][64];

    public static void main(String[] args) throws Exception {
        for (int i = 0; i < 64; i++) {
            C[i][0] = C[i][i] = 1;
            for (int j = 1; j < i; j++) {
                C[i][j] = C[i-1][j-1] + C[i-1][j];
            }
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            int d = (int)(Math.log(n) / Math.log(2));
            long result = 0;

            for (int i = 0; i <= d; i++) {
                int need = k - i;

                if (need <= 0) {
                    result += (1L << i);
                    continue;
                }
                if (need > i) continue;

                for (int j = need; j <= i; j++) {
                    result += C[i][j];
                }
            }

            System.out.println(result);
        }
    }
}
