public class SecondHighestNo {
    public static int findSecondLargest(int[] arr){
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for(int i: arr){
            if(i < second){
                continue;
            } else if(i > first){
                second = first;
                first = i;
            } else{
                second = i;
            }

        }
        return second;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,7,3,1,6,9,10, 100, 8};
        System.out.println(findSecondLargest(arr));
    }
}
