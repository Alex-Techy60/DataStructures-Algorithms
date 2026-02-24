import java.util.Arrays;

public class CycleSort {
    public static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int correct = arr[i] - 1;
            if(correct != i){
                int temp = arr[i];
                arr[i] = arr[correct];
                arr[correct] = temp;
            } else{
                i++;
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {3,2,4,5,1};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
