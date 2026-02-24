import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int[] result = new int[n];
            boolean toggle = true;
            int val1 = 1;
            int val2 = n;
            for(int i=n-1; i>=0; i--) {
                if(toggle) {
                    result[i] = val1++;
                    toggle = false;
                } else {
                    result[i] = val2--;
                    toggle = true;
                }
            }
            for(int i=0; i<n-1; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println(result[n-1]);
        }
    }
}