import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            String p = br.readLine();
            String h = br.readLine();
            int n = p.length();
            int m = h.length();
            boolean result = false;
            for(int i=0; i<(m-n+1); i++) {
                if(canForm(p, h.substring(i, (i+n)))) {
                    result = true;
                    break;
                }
            }
            if(result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
    private static boolean canForm(String p, String h) {
        int[] arr = new int[26];
        int n = p.length();
        for(int i=0; i<n; i++) {
            char ch = p.charAt(i);
            arr[ch-'a']++;
        }
        for(int i=0; i<n; i++) {
            char ch = h.charAt(i);
            arr[ch-'a']--;
        }
        for(int i=0; i<26; i++) {
            if(arr[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
