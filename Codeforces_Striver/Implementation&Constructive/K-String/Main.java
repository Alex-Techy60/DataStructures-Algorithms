import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        String s = br.readLine();
        StringBuilder sb = new StringBuilder();
        int n = s.length();
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            arr[ch - 'a']++;
        }
        boolean canRearrange = true;
        for(int i=0; i<26; i++){
            if(arr[i] % k != 0){
                canRearrange = false;
                break;
            }
        }
        if(canRearrange){
            while(k > 0){
                for(int i=0; i<26; i++){
                    char ch = (char)('a' + i);
                    int temp = arr[i] / k;
                    for(int j=0; j<temp; j++){
                        sb.append(ch);
                    }
                    arr[i] -= temp;
                }
                k--;
            }
            System.out.println(sb);
        } else {
            System.out.println(-1);
        }
    }
}
