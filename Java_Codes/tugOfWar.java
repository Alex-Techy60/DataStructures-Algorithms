import java.util.Arrays;

public class tugOfWar {
    private static int minDiff = Integer.MAX_VALUE;

    public static void tugOfWar(int[] arr, int[] arr1, int[] arr2) {
        int n = arr.length;
        int[] temp = new int[arr1.length];
        int sum1 = 0, sum2 = 0;
        for (int i : arr) {
            sum2 += i;
        }
        helper(arr, arr1, temp, 0, 0, arr1.length, sum1, sum2);

        boolean[] picked = new boolean[arr.length];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (!picked[j] && arr1[i] == arr[j]) {
                    picked[j] = true;
                    break;
                }
            }
        }
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (!picked[i]) {
                arr2[idx++] = arr[i];
            }
        }

    }

    private static void helper(int[] arr, int[] arr1, int[] temp, int index, int count, int reqCount, int sum1,
            int sum2) {
        if (index == arr.length) {
            if (count == reqCount) {
                int diff = Math.abs(sum1 - sum2);
                if (minDiff > diff) {
                    minDiff = diff;
                    System.arraycopy(temp, 0, arr1, 0, temp.length);

                }
            }
            return;
        }
        if (count == reqCount) {
            int diff = Math.abs(sum1 - sum2);
            if (minDiff > diff) {
                minDiff = diff;
                System.arraycopy(temp, 0, arr1, 0, temp.length);

            }
            return;
        }
        temp[count] = arr[index];
        helper(arr, arr1, temp, index + 1, count + 1, reqCount, sum1 + temp[count], sum2 - temp[count]);
        temp[count] = 0;
        helper(arr, arr1, temp, index + 1, count, reqCount, sum1, sum2);
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, -3, 100, 1, 89, 54, 23, 20 };
        int n = arr.length;
        int[] arr1 = new int[(n % 2 == 0) ? n / 2 : (n - 1) / 2];
        int[] arr2 = new int[(n % 2 == 0) ? n / 2 : (n + 1) / 2];
        tugOfWar(arr, arr1, arr2);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
