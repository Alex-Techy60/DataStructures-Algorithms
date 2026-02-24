import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.function.IntToDoubleFunction;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int t = Integer.parseInt(st1.nextToken());
        int arr[] = new int[n];
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i=0; i<n-1; i++) {
            arr[i] = Integer.parseInt(st2.nextToken());
        }
        int curr = 1;
        while(curr < t) {
            curr += arr[curr-1];
        }
        System.out.println((curr == t) ? "YES" : "NO");
    }
}
