import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if(n < 18) {
            if(n % 4 != 0 && n % 7 != 0) {
                if(n != 11 && n != 15) {
                    System.out.println(-1);
                    return;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        while(n % 7 != 0) {
            n -= 4;
            sb.append(4);
        }
        while(n > 0) {
            n -= 7;
            sb.append(7);
        }
        System.out.println(sb);
    }
}
