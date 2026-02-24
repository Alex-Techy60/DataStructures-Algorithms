import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        if(n < m){
            System.out.println(-1);
            return;
        }
        int minStep = (n+1) / 2;
        int rem = minStep % m;
        if(rem == 0){
            System.out.println(minStep);
        } else {
            System.out.println(minStep + (m - minStep % m));
        }
    }
}
