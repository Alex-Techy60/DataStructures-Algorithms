import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        char first = s.charAt(0);
        if(first > 90){
            first = (char)(first - 32);
        }
        String result = first + s.substring(1);
        System.out.println(result);
    }
}
