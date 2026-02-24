import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int temp = n;
        int i = 1;
        int result = 0;
        while(temp > 0){
            result += (temp * i) - (i-1);
            temp--;
            i++;
        }
        System.out.println(result);
    }
}
