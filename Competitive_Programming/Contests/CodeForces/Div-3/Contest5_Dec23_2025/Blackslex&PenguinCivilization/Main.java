import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int m = 1 << n;

            StringBuilder out = new StringBuilder();

            for (int k = n - 1; k >= 0; k--) {
                int l = 1 << k;
                int r = Math.min((1 << (k + 1)) - 1, m - 1);
                for (int i = r; i >= l; i--) {
                    out.append(i).append(" ");
                }
            }

            System.out.println(out.toString().trim());
        }
    }
}
