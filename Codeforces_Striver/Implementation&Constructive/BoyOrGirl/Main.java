import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        boolean[] arr = new boolean[26];
        int n = s.length();
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            arr[ch - 'a'] = true; 
        }
        int count = 0;
        for(int i=0; i<26; i++){
            if(arr[i]){
                count++;
            }
        }
        if(count % 2 != 0){
            System.out.println("IGNORE HIM!");
        } else {
            System.out.println("CHAT WITH HER!");
        }
    }
}
