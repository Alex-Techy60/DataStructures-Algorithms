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
        int left = m / n;
        int moves = 0;
        if(m % n != 0){
            System.out.println(-1);
            return;
        }
        while(left % 2 == 0){
            left /= 2;
            moves++;
        }
        while(left % 3 == 0){
            left /= 3;
            moves++;
        }
        if(left == 1){
            System.out.println(moves);
        } else {
            System.out.println(-1);
        }
    }
}
