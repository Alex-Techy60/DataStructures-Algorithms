import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        boolean greater = true;
        for(int i=0; i<n; i++) {
            int curr = Integer.parseInt(br.readLine());
            if(curr % 2 != 0) {
                if(greater) {
                    curr++;
                } else {
                    curr--;
                }
                greater = !(greater);
            }
            arr[i] = curr / 2;
        }
        for(int i=0; i<n; i++) {
            System.out.println(arr[i]);
        }
    }
}
