import java.util.Arrays;

public class Selection_sort {
    public static void main(String args[]){
        int[] arr = {3,1,2,4,5};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            int last = arr.length-i-1;
            int index = getMaxIndex(arr, 0, last);
            swap(arr, index, last);
        }
    }
    public static int getMaxIndex(int[] arr, int start, int end){
        int idx = start;
        for(int i=start; i<=end; i++){
            if(arr[i]>arr[idx]){
                idx = i;
            }
        }
        return idx;
    }
    public static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}