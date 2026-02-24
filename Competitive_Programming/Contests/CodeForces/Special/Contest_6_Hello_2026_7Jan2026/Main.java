import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            TreeSet<Integer> ones = new TreeSet<>();
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '1') {
                    ones.add(i);
                }
            }
            int ops = n / 2;
            int[] choices = new int[ops];
            for (int x = ops; x >= 1; x--) {
                int l = 0;
                Iterator<Integer> it = ones.iterator();
                while (it.hasNext()) {
                    int i = it.next();
                    if (i + x >= n) break;
                    if (ones.contains(i + x)) {
                        l = i + 1;  // convert to 1‑indexed
                        it.remove();
                        ones.remove(i + x);
                        break;
                    }
                }
                choices[x - 1] = l;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < ops; i++) {
                if (i > 0) sb.append(" ");
                sb.append(choices[i]);
            }
            pw.println(sb);
        }
        pw.flush();
    }
}