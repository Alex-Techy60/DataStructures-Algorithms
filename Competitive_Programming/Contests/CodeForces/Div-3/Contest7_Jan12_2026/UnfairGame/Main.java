import java.io.*;
import java.util.*;

public class Main {
    static long[][] C;
    static void precompute() {
        C = new long[31][31];
        for (int i = 0; i <= 30; i++) {
            C[i][0] = C[i][i] = 1;
            for (int j = 1; j < i; j++) {
                C[i][j] = C[i - 1][j - 1] + C[i - 1][j];
            }
        }
    }
    public static void main(String[] args) throws IOException {
        precompute();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            int d = (int)(Math.log(n) / Math.log(2));
            long count = 0;
            if (d + 1 > k) count++;
            for (int b = 0; b <= d - 1; b++) {
                long t_val = k - b - 1;
                if (t_val < 0) {
                    count += (1L << b);
                } else if (t_val < b) {
                    for (int j = (int) t_val + 1; j <= b; j++) {
                        count += C[b][j];
                    }
                }
            }
            System.out.println(count);
        }
    }
}