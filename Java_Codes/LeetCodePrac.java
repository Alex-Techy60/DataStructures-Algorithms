import java.util.*;

public class LeetCodePrac {

    private static int divisibleSubset(int[] arr, int k) {
        HashSet<Integer> set = new HashSet<>();
        return helperDS(arr, k, set);
    }

    private static int helperDS(int[] arr, int k, HashSet<Integer> set) {
        if (k % 3 == 0) {
            return set.size();
        }
        int n = arr.length;
        int maxSize = 0;
        for (int i = 0; i < n; i++) {
            set.add(arr[i]);
            maxSize = Math.max(maxSize, helperDS(arr, k - arr[i], set));
            set.remove(arr[i]);
        }
        return maxSize;
    }

    static int index = 0;

    private static String decoder(String s) {
        StringBuilder sb = new StringBuilder();

        while (index < s.length()) {
            char ch = s.charAt(index);
            if (Character.isDigit(ch)) {
                int k = 0;
                while (Character.isDigit(s.charAt(index))) {
                    k = k * 10 + (s.charAt(index) - '0');
                    index++;
                }
                index++;
                String decoded = decoder(s);
                while (k-- > 0) {
                    sb.append(decoded);
                }
            } else if (ch == ']') {
                index++;
                break;
            } else {
                index++;
                sb.append(ch);
            }
        }
        return sb.toString();
    }

    public static String getPermutation(int n, int k) {
        List<Integer> nums = new ArrayList<Integer>();
        for (int i = 1; i <= n; i++) {
            nums.add(i);
        }
        return helper(nums, k);
    }

    private static String helper(List<Integer> nums, int k) {
        int n = nums.size();
        if (nums.size() == 1) {
            return nums.remove(0) + "";
        }
        int pass = factorial(n - 1);
        int index = (k - 1) / pass;
        int currDigit = nums.get(index);
        nums.remove(index);
        k -= (index * pass);
        return currDigit + "" + helper(nums, k);
    }

    private static int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<>();
        helperOfCombinationSum3(1, k, n, new ArrayList<Integer>(), result);
        return result;
    }

    private static void helperOfCombinationSum3(int start, int k, int n, List<Integer> list,
            List<List<Integer>> result) {
        if (list.size() == k) {
            if (n == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = start; i < 10; i++) {
            if (n - i < 0) {
                break;
            }
            list.add(i);
            helperOfCombinationSum3(i + 1, k, n - i, list, result);
            list.remove((Integer)i);
        }
    }
    public static int[] countBits(int n) {
        int[] arr = new int[n+1];
        for(int i=0; i<=n; i++){
            arr[i] = countOnes(i);
        }
        return arr;
    }
    private static int countOnes(int n){
        int bitMask = 1;
        int count = 0;
        while(bitMask <= n){
            if((bitMask & n) != 0){
                count++;
            }
            bitMask <<= 1;
        }
        return count;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(Arrays.toString(countBits(n)));
    }
}
