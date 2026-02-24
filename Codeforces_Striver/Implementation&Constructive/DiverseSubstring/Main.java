import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        boolean present = false;
        char ch = s.charAt(0);
        for(int i=1; i<n; i++) {
            if(s.charAt(i) != ch) {
                present = true;
                System.out.println("YES");
                System.out.println(ch + "" + s.charAt(i));
                break;
            }
        }
        if(!present) {
            System.out.println("NO");
        }
    }
}
