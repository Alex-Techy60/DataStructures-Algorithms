import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long k = Long.parseLong(st.nextToken());
            if (n == k) {
                sb.append("0\n");
                continue;
            }
            int ans = -1;
            for (int m = 1; m <= 60; m++) {
                long two_pow_m = 1L << m;
                long L = two_pow_m * k - (two_pow_m - 1);
                long R = two_pow_m * k + (two_pow_m - 1);
                if (L <= n && n <= R) {
                    ans = m;
                    break;
                }
                if (k > 1 && L > n) {
                    break;
                }
            }
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}