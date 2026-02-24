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
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            long[] red = new long[n];
            long[] blue = new long[n];
            for(int i=0; i<n; i++) {
                red[i] = Long.parseLong(st1.nextToken());
                blue[i] = Long.parseLong(st2.nextToken());
            }
            long minScore = 0;
            long maxScore = 0;
            for(int i=0; i<n; i++) {
                long temp = Math.min(minScore - red[i], blue[i] - maxScore);
                maxScore = Math.max(maxScore - red[i], blue[i] - minScore);
                minScore = temp;
            }
            System.out.println(maxScore);
        }
    }
}
