import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.List;

public class Main {
    static class Pair {
        int idx;
        int days;
        Pair(int idx, int days) {
            this.idx = idx;
            this.days = days;
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Pair[] arr = new Pair[n];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
            arr[i] = new Pair(i+1, Integer.parseInt(st.nextToken()));
        }

        Arrays.sort(arr, (a, b) -> a.days - b.days);
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<n; i++) {
            if(k < arr[i].days) {
                break;
            }
            result.add(arr[i].idx);
            k -= arr[i].days;
        }
        Collections.sort(result, (a, b) -> a - b);
        System.out.println(result.size());
        for(int num: result) {
            System.out.print(num + " ");
        }

    }
}
