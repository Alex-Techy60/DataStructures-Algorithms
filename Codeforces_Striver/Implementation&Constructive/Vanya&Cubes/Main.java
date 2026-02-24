import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int level = 0;
        int cube = 1;
        int sum = 1;
        while(n >= sum){
            level++;
            n -= sum;
            cube++;
            sum += cube;
        }
        System.out.println(level);
    }
}

