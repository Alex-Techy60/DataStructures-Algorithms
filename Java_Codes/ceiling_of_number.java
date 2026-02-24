import java.util.Scanner;

public class ceiling_of_number {
    public static int ceiling(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            } else if(arr[mid]<target){
                start = mid+1;
            } else {
                return arr[mid];
            }
        }
        return arr[end+1];
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,5,6,8,10,12,14,16,18,22,26,29,30};
        System.out.println(ceiling(arr, 7));
    }
}
