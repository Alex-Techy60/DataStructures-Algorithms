import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int[] arr = new int[t];
        List<List<Integer>> result = new ArrayList<>();
        for(int i=0; i<t; i++){
            String s = br.readLine();
            arr[i] = findSum(s);
            findNums(new ArrayList<>(), result, Integer.parseInt(s));
        }
        for(int i=0; i<t; i++){
            System.out.println(arr[i]);
            printarr(result.get(i));
        }
    }
    private static void printarr(List<Integer> arr){
        int n = arr.size();
        for(int i=0; i<n; i++){
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();
    }
    private static int findSum(String n){
        int count = 0;
        int size = n.length();
        for(int i=0; i<size; i++){
            if(n.charAt(i) == '0') continue;
            count++;
        }
        return count;
    }
    private static void findNums(List<Integer> curr, List<List<Integer>> result, int n){
        int temp = (int)Math.pow(10, (int)Math.log10(n));
        while(temp > 0){
            int div = n / temp;
            if(div != 0){
                curr.add(div * temp);
                n %= temp;
            }
            temp /= 10;
        }
        result.add(curr);
    }
}
