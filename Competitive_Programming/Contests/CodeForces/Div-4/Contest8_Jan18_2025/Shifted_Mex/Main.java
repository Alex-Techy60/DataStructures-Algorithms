import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] arr = new int[n];
            for(int i=0; i<n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(arr);
            int maxCons = 1;
            int currCons = 1;
            for(int i=1; i<n; i++) {
                if(arr[i] == arr[i-1] + 1) {
                    currCons++;
                } else if(arr[i] == arr[i-1]) {
                    continue;
                } else {
                    maxCons = Math.max(maxCons, currCons);
                    currCons = 1;
                }
            }
            maxCons = Math.max(maxCons, currCons);
            System.out.println(maxCons);

        }
    }
}
