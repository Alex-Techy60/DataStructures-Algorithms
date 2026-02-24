import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[7];
        int sum = 0;
        for(int i=0; i<7; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            sum += arr[i];
        }
        int lastWeek = n % sum;
        if(lastWeek == 0){
            for(int i=6; i>=0; i--){
                if(arr[i] != 0){
                    System.out.println(i+1);
                    break;
                }
            }
        } else {
            for(int i=0; i<7; i++){
            lastWeek -= arr[i];
            if(lastWeek <= 0){
                System.out.println(i+1);
                break;
            }
        }
        }
    }
}
