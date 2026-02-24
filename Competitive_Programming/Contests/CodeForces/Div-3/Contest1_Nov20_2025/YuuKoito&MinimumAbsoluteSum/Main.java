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
            int[] arr = new int[n];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            int L = arr[0];
            int R = arr[n - 1];

            if (L == -1 && R == -1) {
                arr[0] = 0;
                arr[n - 1] = 0;
            } else if (L == -1) {
                arr[0] = R;
            } else if (R == -1) {
                arr[n - 1] = L;
            }

            for (int i = 1; i < n - 1; i++) {
                if (arr[i] == -1) arr[i] = 0;
            }

            int result = Math.abs(arr[n - 1] - arr[0]);

            System.out.println(result);
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}
