import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int n = s.length();
        StringBuilder sb = new StringBuilder();
        Set<Character> vowels = new HashSet<>(Set.of('a', 'e', 'i', 'o', 'u', 'y', 'A', 'E', 'I', 'O', 'U', 'Y'));
        for(int i=0; i<n; i++){
            char ch = s.charAt(i);
            if(!vowels.contains(ch)){
                sb.append('.');
                if(ch > 90){
                    sb.append(ch);
                } else{
                    ch = (char)(ch + 32);
                    sb.append(ch);
                }
            }
        }
        System.out.println(sb);
    }
}
