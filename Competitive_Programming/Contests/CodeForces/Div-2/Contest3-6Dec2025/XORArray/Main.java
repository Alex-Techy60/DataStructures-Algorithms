import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();
        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());
            int[] pref = new int[n + 1];
            pref[0] = 0;
            for (int i = 1; i <= n; i++) {
                if (i == r) pref[i] = l - 1;
                else pref[i] = i;
            }
            for (int i = 1; i <= n; i++) {
                int ai = pref[i] ^ pref[i - 1];
                out.append(ai).append(' ');
            }
            out.append('\n');
        }
        System.out.print(out.toString());
    }
}
