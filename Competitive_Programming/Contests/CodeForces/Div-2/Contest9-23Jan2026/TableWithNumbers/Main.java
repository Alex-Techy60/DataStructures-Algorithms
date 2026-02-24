import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int h = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            st = new StringTokenizer(br.readLine());
            int possibleRow = 0;
            int possibleCol = 0;
            for(int i=0; i<n; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num <= l) {
                    possibleCol++;
                }
                if(num <= h) {
                    possibleRow++;
                }
            }
            int diff = Math.abs(possibleRow - possibleCol);
            int result = 0;
            if(Math.min(possibleRow, possibleCol) <= diff) {
                result = Math.min(possibleRow, possibleCol);
            } else {
                result = diff + ((Math.min(possibleRow, possibleCol) - diff) / 2);
            }
            System.out.println(result);
        }
    }
}