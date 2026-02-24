import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] present = new boolean[n + 1];
            for (int i = 0; i < n; i++) {
                int x = Integer.parseInt(st.nextToken());
                if (x <= n) present[x] = true;
            }

            int[] dist = new int[n + 1];
            Arrays.fill(dist, -1);

            Queue<Integer> q = new LinkedList<>();
            for (int i = 1; i <= n; i++) {
                if (present[i]) {
                    dist[i] = 1;
                    q.add(i);
                }
            }

            while (!q.isEmpty()) {
                int u = q.poll();
                for (int k = 1; k <= n / u; k++) {
                    if (!present[k]) continue;
                    int v = u * k;
                    if (dist[v] == -1) {
                        dist[v] = dist[u] + 1;
                        q.add(v);
                    }
                }
            }
            int[] result = new int[n];
            for (int i = 1; i <= n; i++) {
                result[i-1] = dist[i];
            }
            for (int i = 0; i < n-1; i++) {
                    System.out.print(result[i] + " ");
            }
            System.out.println(result[n-1]);
        }
    }
}
