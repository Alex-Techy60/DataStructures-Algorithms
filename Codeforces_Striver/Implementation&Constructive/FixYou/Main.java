import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int count = 0;
            while(n > 1){
                String s = br.readLine();
                if(s.charAt(m-1) == 'R'){
                    count++;
                }
                n--;
            }
            String s = br.readLine();
            for(int i=0; i<m-1; i++){
                if(s.charAt(i) == 'D'){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
