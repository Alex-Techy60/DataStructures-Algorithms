import java.util.Arrays;

public class Arrays2D_Bin {

    public static int[] search(int[][] arr, int target){
        int r=0, c=arr.length-1;
        while(r<arr.length && c>=0){
            if(arr[r][c] == target){
                return new int[]{r, c};
            } else if(arr[r][c] < target){
                r++;
            } else{
                c--;
            }
        }
        return new int[]{-1, -1};
        }
    public static void main(String[] args){
        int[][] arr = {
            {2,3,6,8,9},
            {4,7,10,12,15},
            {5,11,17,18,20},
            {13, 22, 24, 25, 29}
        };
        System.out.println(Arrays.toString(search(arr, 18)));
    }
}