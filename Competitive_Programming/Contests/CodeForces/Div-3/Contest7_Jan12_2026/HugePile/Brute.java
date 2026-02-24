import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Brute {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        Set<Integer> seen = new HashSet<>();
        while(T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            int result = helper(seen, n, k, 0);
            System.out.println(result);
        }
    }
    private static int helper(Set<Integer> seen, int n, int k, int depth) {
        if(n == k) {
            return depth;
        }
        if(seen.contains(n)) {
            return -1;
        }
        seen.add(n);
        int res1 = helper(seen, n/2, k, depth+1);
        int res2 = helper(seen, (n+1)/2, k, depth+1);
        if(res1 == -1) {
            return res2;
        } else if(res2 == -1) {
            return res1;
        } else {
            return Math.min(res1, res2);
        }
    }
}
