import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int[] a = new int[n];
            st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
            }
            boolean[] present = new boolean[n + 2];
            for (int num : a) {
                if (num <= n) {
                    present[num] = true;
                }
            }   
            int mex = 0;
            while (present[mex]) {
                mex++;
            }
            int result = Math.min(mex, k - 1);
            System.out.println(result);
        }
    }
}