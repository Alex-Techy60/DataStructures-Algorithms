import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {

            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            long h = Long.parseLong(st.nextToken());

            long[] arr = new long[n];
            long[] newArr = new long[n];

            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Long.parseLong(st.nextToken());
                newArr[i] = arr[i];
            }

            boolean[] used = new boolean[n];
            ArrayList<Integer> touched = new ArrayList<>();

            for (int i = 0; i < m; i++) {
                st = new StringTokenizer(br.readLine());
                int idx = Integer.parseInt(st.nextToken()) - 1;
                long c = Long.parseLong(st.nextToken());

                if (!used[idx]) {
                    used[idx] = true;
                    touched.add(idx);
                }

                newArr[idx] += c;

                if (newArr[idx] > h) {
                    for (int x : touched) {
                        newArr[x] = arr[x];
                        used[x] = false;
                    }
                    touched.clear();
                }
            }

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++) {
                sb.append(newArr[i]).append(' ');
            }
            System.out.println(sb.toString().trim());
        }
    }
}
