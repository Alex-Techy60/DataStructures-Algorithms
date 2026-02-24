import java.util.Scanner;

public class Sorted_array {
    public static void checking_array(int arr[], int index, boolean inc, boolean dec){
        if(inc == false && dec == false){
            System.out.println("The array isn't sorted");
            return;
        }
        if(index == arr.length-1){
            if(inc == true){
                System.out.println("The array is in ascending order");
            } else if(dec == true){
                System.out.println("The array is in descending order");
            } else {
                System.out.println("The array isn't sorted");
            }
            return;
        }
        if(arr[index]<arr[index+1]){
            dec = false;
        } else if(arr[index]>arr[index+1]){
            inc = false;
        }
        checking_array(arr, index+1, inc, dec);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Array, (separate numbers by comma)");
        String str = sc.nextLine();
        String strArr[] = str.split(",");
        int arr[] = new int[strArr.length];
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(strArr[i]);
        }
        checking_array(arr, 0, true, true);
    }
}
