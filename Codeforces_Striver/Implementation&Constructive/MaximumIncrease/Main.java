import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = 0;
        int prev = 0;
        int count = 0;
        while(n-- > 0){
            int num = Integer.parseInt(st.nextToken());
            if(num > prev){
                count++;
            } else{
                count = 1;
            }
            result = Math.max(count, result);
            prev = num;
        }
        System.out.println(result);
    }
}
