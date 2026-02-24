import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int maxCapacity = 0;
        int currCapacity = 0;
        while(n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            currCapacity -= Integer.parseInt(st.nextToken());
            currCapacity += Integer.parseInt(st.nextToken());
            maxCapacity = Math.max(maxCapacity, currCapacity);
        }
        System.out.println(maxCapacity);
    }
}
