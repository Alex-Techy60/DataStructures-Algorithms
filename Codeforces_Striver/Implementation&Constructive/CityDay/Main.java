import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for(int i=0; i<n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        for(int i=0; i<n; i++) {
            int element = arr[i];
            int start = i-1;
            int end = i+1;
            boolean canCelebrate = true;
            while(start >= 0 && (i - start <= x)) {
                if(element > arr[start]) {
                    canCelebrate = false;
                    break;
                }
                start--;
            }
            while(canCelebrate && end < n && (end - i <= y)) {
                if(element > arr[end]) {
                    canCelebrate = false;
                    break;
                }
                end++;
            }
            if(canCelebrate){
                System.out.println(i+1);
                break;
            }
        }
        
    }
}
