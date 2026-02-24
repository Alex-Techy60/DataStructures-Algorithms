import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int minDiff = Integer.MAX_VALUE;
        for(int i=min; i<=max; i++){
            int diff = Math.abs(i - a) + Math.abs(i - b) + Math.abs(i - c);
            minDiff = Math.min(diff, minDiff);
        }
        System.out.println(minDiff);
    }
}
