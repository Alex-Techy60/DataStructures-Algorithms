import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int x = 0;
        int y = 0;
        int z = 0;
        while(n-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            x += Integer.parseInt(st.nextToken());
            y += Integer.parseInt(st.nextToken());
            z += Integer.parseInt(st.nextToken());
        }
        if(x == 0 && y == 0 && z == 0){
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
