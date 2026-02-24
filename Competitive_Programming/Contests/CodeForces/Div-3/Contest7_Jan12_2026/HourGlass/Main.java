import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- >  0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            if(s <= k) {
                int timeLeft = m % k;
                if(timeLeft >= s) {
                    System.out.println(0);
                } else {
                    System.out.println(s - timeLeft);
                }
            } else {
                int totalFlips = m / k;
                if(totalFlips % 2 == 0) {
                    int timeLeft = m % k;
                    if(timeLeft >= s) {
                        System.out.println(0);
                    } else {
                        System.out.println(s - timeLeft);
                    }
                } else {
                    int timeLeft = m % k;
                    if(timeLeft >= s) {
                        System.out.println(0);
                    } else {
                        System.out.println(k - timeLeft);
                    }
                }
            }
        }
    }
}
