import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int limakWeight = Integer.parseInt(st.nextToken());
        int bobWeight = Integer.parseInt(st.nextToken());
        int result = 0;
        while(limakWeight <= bobWeight){
            limakWeight *= 3;
            bobWeight *= 2;
            result++;
        }
        System.out.println(result);
    }
}
