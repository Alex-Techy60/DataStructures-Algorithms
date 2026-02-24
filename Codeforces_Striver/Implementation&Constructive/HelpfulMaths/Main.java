import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int one = 0;
        int two = 0;
        int three = 0;
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(ch == '1'){
                one++;
            } else if(ch == '2'){
                two++;
            } else if(ch == '3'){
                three++;
            }
        }
        StringBuilder sb = new StringBuilder();
        while(one-- > 0){
            sb.append(1);
            sb.append('+');
        }
        while(two-- > 0){
            sb.append(2);
            sb.append('+');
        }
        while(three-- > 0){
            sb.append(3);
            sb.append('+');
        }
        sb.deleteCharAt(sb.length() - 1);
        System.out.println(sb);
    }
}
