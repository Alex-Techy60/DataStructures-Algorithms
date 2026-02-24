import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while(T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            List<Integer> colors = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int maxColor = 0;
            for(int i=0; i<n; i++) {
                int color = Integer.parseInt(st.nextToken());
                if(!colors.contains(color)) {
                    colors.add(color);
                }
                maxColor = Math.max(maxColor, color);
            }
            int unique = colors.size();
            Collections.sort(colors);
            if(unique >= maxColor) {
                System.out.println(unique);
            } else {
                for(int color: colors) {
                    if(color >= unique) {
                        System.out.println(color);
                        break;
                    }
                }
            }
        }
    }
}