import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while(t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int x = Integer.parseInt(st.nextToken());
            int result = 2;
            while(check(result, k, x)) {
                result++;
            }
            System.out.println(result);
        }
    }
    private static boolean check(int result, int k, int x) {
        int avail = k;
        while(result > 0) {
            if(avail == 0) {
                return false;
            }
            result -= x;
            avail--;
        }
        return true;
    }
}
