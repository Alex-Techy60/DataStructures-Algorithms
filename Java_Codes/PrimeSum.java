import java.util.*;

public class PrimeSum {
    public static List<List<Integer>> allSum(int p, int n, int s) {
        List<List<Integer>> result = new ArrayList<>();
        helper(p + 1, s, n, result, new ArrayList<>());
        return result;
    }

    private static void helper(int start, int sum, int n, List<List<Integer>> result, List<Integer> list) {
        if (n == 0) {
            if (sum == 0) {
                result.add(new ArrayList<>(list));
            }
            return;
        }

        for (int i = start; i <= sum; i++) {
            if (isPrime(i)) {
                list.add(i);
                helper(i + 1, sum - i, n - 1, result, list);
                list.remove(list.size() - 1); // FIXED: remove last added element
            }
        }
    }

    private static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime number:");
        int p = sc.nextInt();
        System.out.println("Enter total number of prime numbers:");
        int n = sc.nextInt();
        System.out.println("Enter the sum:");
        int s = sc.nextInt();

        List<List<Integer>> result = allSum(p, n, s);
        System.out.println(result);
    }
}
