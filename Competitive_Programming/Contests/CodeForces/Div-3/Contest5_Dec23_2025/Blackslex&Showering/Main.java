import java.io.IOException;
import java.io.BufferedReader;
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
            arr[0] = Integer.parseInt(st.nextToken());
            int diffSum = 0;
            for(int i=1; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
                diffSum += Math.abs(arr[i] - arr[i-1]);
            }
            int maxDiff = Math.max(Math.abs(arr[1] - arr[0]), Math.abs(arr[n-1] - arr[n-2]));
            for(int i=1; i<n-1; i++) {
                if(arr[i] > arr[i-1] && arr[i] > arr[i+1]) {
                    maxDiff = Math.max(maxDiff, arr[i] - arr[i-1] + arr[i] - arr[i+1] - Math.abs(arr[i-1] - arr[i+1]));
                } else if(arr[i] < arr[i-1] && arr[i] < arr[i+1]) {
                    maxDiff = Math.max(maxDiff, arr[i-1] - arr[i] + arr[i+1] - arr[i] - Math.abs(arr[i-1] - arr[i+1]));
                }
            }
            System.out.println(diffSum - maxDiff);
        }
    }
}
