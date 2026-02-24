import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            System.out.println(2);
            if(n > 2){
                System.out.println(n + " " + (n-2));
                n--;
                System.out.println(n + " " + n);
            } else {
                System.out.println(2 + " " + 1);
            }
            while(n > 2){
                System.out.println(n + " " + (n-2));
                n--;
            }
        }

    }
}
