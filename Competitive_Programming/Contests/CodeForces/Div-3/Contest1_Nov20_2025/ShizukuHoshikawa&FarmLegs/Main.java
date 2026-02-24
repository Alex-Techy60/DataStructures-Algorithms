import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            if(n % 2 == 1){
                System.out.println(0);
                continue;
            }
            int countFours = n / 4;
            System.out.println(countFours + 1);
        }
    }
}