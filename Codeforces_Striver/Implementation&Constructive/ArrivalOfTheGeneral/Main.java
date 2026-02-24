import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int maxPos = 0;
        int maxHeight = Integer.MIN_VALUE;
        int minHeight = Integer.MAX_VALUE;
        int minPos = 0;
        for(int i=0; i<n; i++){
            int curr = Integer.parseInt(st.nextToken());
            if(curr > maxHeight){
                maxHeight = curr;
                maxPos = i;
            }
            if(curr <= minHeight){
                minHeight = curr;
                minPos = i;
            }
        }
        int timeTaken = (maxPos + n - 1 - minPos);
        if(maxPos > minPos){
            timeTaken--;
        }
        System.out.println(timeTaken);
    }
}
