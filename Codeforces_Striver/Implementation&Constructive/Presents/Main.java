import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] gave = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            gave[i] = Integer.parseInt(st.nextToken());
        }
        int[] recieve = new int[n];
        for(int i=0; i<n; i++){
            recieve[gave[i]-1] = i+1;
        }
        for(int i=0; i<n; i++){
            System.out.print(recieve[i] + " ");
        }
        System.out.println();
    }    
}
