import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        int add = 1;
        while(i < n){
            sb.append(s.charAt(i));
            i += add;
            add++;
        }
        System.out.println(sb);
    }
}
