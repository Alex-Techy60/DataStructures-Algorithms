import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean firstUpper = (s.charAt(0) >= 'A' && s.charAt(0) <= 'Z');
        boolean allUpper = true;
        int n = s.length();
        for(int i=1; i<n; i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                allUpper = false;
                break;
            }
        }
        if(allUpper) {
            StringBuilder sb = new StringBuilder();
            char ch = s.charAt(0);
            if(firstUpper){
                sb.append((char)(ch + 32));
            } else {
                sb.append((char)(ch - 32));
            }
            for(int i=1; i<n; i++) {
                sb.append((char)(s.charAt(i) + 32));
            }
            System.out.println(sb);
        } else {
            System.out.println(s);
        }
    }
}
