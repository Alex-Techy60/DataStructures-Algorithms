import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            String s = br.readLine();
            int count = 0;
            int result = 0;
            int n = s.length();
            int i=0;
            while(i < n-1 && s.charAt(i) == '0'){
                i++;
            }
            while(i < n){
                char ch = s.charAt(i);
                if(ch == '1'){
                    result += count;
                    count = 0;
                } else{
                    count++;
                }
                i++;
            }
            System.out.println(result);
        }
    }
}
