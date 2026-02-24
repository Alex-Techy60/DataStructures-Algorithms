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
            int size = (int)(Math.pow(2, n));
            int[] cows = new int[size];
            int[] result = new int[q];
            st = new StringTokenizer(br.readLine());
            for(int i=0; i<size; i++) {
                cows[i] = Integer.parseInt(st.nextToken());
            }
            for(int i=0; i<q; i++) {
                st = new StringTokenizer(br.readLine());
                int superCow = Integer.parseInt(st.nextToken());
                int power = Integer.parseInt(st.nextToken());
                int above = 0;
                if(superCow % 2 == 0) {
                    if(str)
                }
            }
        }
    }
}
