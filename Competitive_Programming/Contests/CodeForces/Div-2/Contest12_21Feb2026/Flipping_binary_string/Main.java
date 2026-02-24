import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String s = br.readLine();
            int countOne = 0;
            List<Integer> ones = new ArrayList<>();
            List<Integer> zeros = new ArrayList<>();
            int countZeros = 0;
            for(int i=0; i<n; i++) {
                if(s.charAt(i) == '1') {
                    ones.add(i+1);
                    countOne++;
                } else {
                    countZeros++;
                    zeros.add(i+1);
                }
            }
            if(countOne == 0) {
                System.out.println(0);
                continue;
            }
            if(n % 2 == 0) {
                if(countOne % 2 == 0) {
                    System.out.println(countOne);
                    for(int i=0; i<(countOne - 1); i++) {
                        System.out.print(ones.get(i) + " ");
                    }
                    System.out.println(ones.get(countOne - 1));
                } else {
                    System.out.println(countZeros);
                    for(int i=0; i<(countZeros - 1); i++) {
                        System.out.print(zeros.get(i) + " ");
                    }
                    System.out.println(zeros.get(countZeros - 1));
                }
            } else {
                if(countOne % 2 == 0) {
                    System.out.println(countZeros);
                    for(int i=0; i<(countZeros - 1); i++) {
                        System.out.print(zeros.get(i) + " ");
                    }
                    System.out.println(zeros.get(countZeros - 1));
                } else {
                    System.out.println(-1);
                }
            }
        }
    }
}
