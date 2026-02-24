import java.util.Arrays;

public class Insertion_Sort {
    public static void insertionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int j=i+1;
            while(j>0){
                if(arr[j]>=arr[j-1]){
                    break;
                }
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
    }
    public static void main(String args[]){
        int arr[] = {7,8,3,1,2};
        insertionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}