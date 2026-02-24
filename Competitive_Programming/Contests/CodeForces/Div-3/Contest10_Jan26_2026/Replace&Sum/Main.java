import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int q = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for(int i=0; i<n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            int[] b = new int[n];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<n; i++) {
                b[i] = Integer.parseInt(st.nextToken());
            }
            a[n-1] = Math.max(a[n-1], b[n-1]);
            for(int i=n-2; i>=0; i--) {
                a[i] = Math.max(a[i+1], Math.max(a[i], b[i]));
            }
            int[] result = new int[q];
            int[] preSum = new int[n];
            preSum[0] = a[0];
            for(int i=1; i<n; i++) {
                preSum[i] = preSum[i-1] + a[i];
            }
            for(int i=0; i<q; i++) {
                st = new StringTokenizer(br.readLine());
                int l = Integer.parseInt(st.nextToken())-1;
                int r = Integer.parseInt(st.nextToken())-1;
                result[i] = preSum[r];
                if(l > 0) {
                    result[i] -= preSum[l-1];
                }
            }
            for(int i=0; i<q-1; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(result[q-1]);
        }
    }
}
