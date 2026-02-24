import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        long result = 0;
        int prev = Integer.MAX_VALUE;
        for(int i=n-1; i>=0; i--) {
            prev = Math.min(prev, arr[i]);
            if(prev <= 0) break;
            result += prev;
            prev--;
        }
        System.out.println(result);
    }    
}
