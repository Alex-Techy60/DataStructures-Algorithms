import java.util.*;

public class MaxSweetness {
    public static void main(String args[]){
        System.out.println(maximizeSweetness(new int[] {1,2,3,4,5,6,7,8,9}, 5));
    }
    public static int maximizeSweetness(int[] nums, int m) {
        m++;
        long l = Integer.MAX_VALUE, r = 0;
        for(int n : nums) {
            r += n;
            l = Math.min(l, n);
        }
        while(l+1 < r) {
            long mid = l + (r-l) / 2;
            if(canSplit(nums, m, mid)) {
                l = mid;
            } else {
                r = mid - 1;
            }
        }
        if(canSplit(nums, m, r)) return (int)r;
        else return (int)l;
    }
    public static boolean canSplit(int[] nums, int m, long target) {
        long sum = 0, count = 0;
        for(int n : nums) {
            if(sum + n >= target) {
                sum = 0;
                count++;
            } else {
                sum += n;
            }
        }
        return count >= m;
    }
}
