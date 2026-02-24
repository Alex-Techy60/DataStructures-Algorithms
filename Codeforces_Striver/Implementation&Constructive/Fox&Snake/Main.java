import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        boolean turn = true;
        for(int row = 0; row < n; row++){
            for(int col = 0; col < m; col++){
                if(row % 2 == 0){
                    System.out.print('#');
                } else{
                    if(turn && col == 0){
                        System.out.print('#');
                    } else if(!turn && col == m-1){
                        System.out.print('#');
                    }else{
                        System.out.print('.');
                    }
                }
            }
            System.out.println();
            if(row % 2 == 0){
                turn = !turn;
            }
        }
    }
}