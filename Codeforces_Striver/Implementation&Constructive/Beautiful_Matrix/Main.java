import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int row = 0;
        int col = 0;
        for(int i=0; i<5; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<5; j++){
                int val = Integer.parseInt(st.nextToken());
                if(val == 1){
                    row = Math.abs(2-i);
                    col = Math.abs(2-j);
                }
            }
        }
        System.out.println(row+col);
    }
}
