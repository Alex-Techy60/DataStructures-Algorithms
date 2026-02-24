import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int[] arr = new int[n];
            int[] result = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int l = 0;
            int maxElement = n;

            for (int i = 0; i < n; i++) {
                if (arr[i] != maxElement) break;
                l++;
                maxElement--;
            }

            if (l == n) {
                for (int i = 0; i < n; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
                continue;
            }

            int r = -1;
            for (int i = l; i < n; i++) {
                if (arr[i] == maxElement) {
                    r = i;
                    break;
                }
            }

            if (r == -1) r = l;

            int idx = 0;

            for (int i = 0; i < l; i++) {
                result[idx++] = arr[i];
            }

            for (int i = r; i >= l; i--) {
                result[idx++] = arr[i];
            }

            for (int i = r + 1; i < n; i++) {
                result[idx++] = arr[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
        }
    }
}
