import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean[] removed = new boolean[n];
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                removed[i] = false;
            }
            int count = 0;
            for(int i=0; i<n-1; i++) {
                if(removed[i]) continue;
                for(int j=i+1; j<n; j++) {
                    if(removed[j]) continue;
                    if(arr[i] > arr[j]) {
                        removed[j] = true;
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
