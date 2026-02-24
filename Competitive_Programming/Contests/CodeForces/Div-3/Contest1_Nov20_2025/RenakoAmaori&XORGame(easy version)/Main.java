import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0){
            int n = Integer.parseInt(br.readLine());
            StringTokenizer A = new StringTokenizer(br.readLine());
            StringTokenizer M = new StringTokenizer(br.readLine());
            boolean oddTurn = true;
            int count = 0;
            boolean oddWinning = false;
            for(int i=0; i<n; i++){
                int a = Integer.parseInt(A.nextToken());
                int m = Integer.parseInt(M.nextToken());
                if(a != m){
                    if(oddTurn){
                        oddWinning = true;
                    } else {
                        oddWinning = false;
                    }
                    count++;
                }
                oddTurn = !(oddTurn);
            }
            if(count % 2 == 0){
                System.out.println("Tie");
            } else{
                if(oddWinning){
                    System.out.println("Ajisai");
                } else {
                    System.out.println("Mai");
                }
            }
        }
    }
}
