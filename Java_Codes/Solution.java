import java.util.*;
public class Solution {
    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        List<Integer> list = new ArrayList<Integer>();
        for(int i=0; i<n; i++){
            list.add(search((Arrays.copyOfRange(nums, i, n)), i));
        }
        return list;
    }
    private int search(int[] arr, int i){
        System.out.println(Arrays.toString(arr));
        
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int left = 0, right = arr.length-1;
        while(left <= right){
            int mid = left + (right-left)/2;
            if(arr[mid] == i){
                System.out.print(mid);
                return mid;
            } else if(arr[mid] > i){
                right = mid-1;
            } else {
                left = mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Solution sol = new Solution();
        System.out.println(sol.countSmaller(new int[] {5,2,6,1}));
    }
}