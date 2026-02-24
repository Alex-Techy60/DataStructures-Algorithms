import java.util.Arrays;

public class Bubble_sort {
    public static void main(String args[]){
        int[] arr = {3,1,2,4,5};
        bubble(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubble(int[] arr){
        boolean sorted;
        for(int i=0; i<arr.length-1; i++){
            sorted = false;
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]){
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                    sorted = true;
                }
            }
            if(!sorted){
                break;
            }
        }
    }
}
