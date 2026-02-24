import java.util.*;

public class Recursion_Prac {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of your array");
        // int n = sc.nextInt();
        // int[] arr = new int[n];
        // for (int i = 0; i < n; i++) {
        // System.out.println("Enter the " + (i + 1) + suffix(i + 1) + " element");
        // arr[i] = sc.nextInt();
        // }
        // System.out.println(Arrays.toString(arr));
        // findMinMax(arr, 0, arr[0], arr[0]);
        String str = sc.nextLine();
        // int n = sc.nextInt();
        ArrayList<String> result = new ArrayList<>();
        lexiPowerSet(str, 0, "", result);
        Collections.sort(result);
        System.out.println(result);
    }

    private static void sumTriangle(int[] arr) {
        int n = arr.length;
        if (n <= 1) {
            return;
        }
        int[] next = new int[n - 1];
        for (int i = 1; i < n; i++) {
            next[i - 1] = arr[i - 1] + arr[i];
        }
        System.out.println(Arrays.toString(next));
        sumTriangle(next);
    }

    private static void findMinMax(int[] arr, int i, int min, int max) {
        if (i == arr.length) {
            System.out.println("minimum = " + min);
            System.out.println("maximum = " + max);
            return;
        }
        if (arr[i] < min)
            min = arr[i];
        if (arr[i] > max)
            max = arr[i];
        findMinMax(arr, i + 1, min, max);
    }

    public static String suffix(int n) {
        if (n % 100 >= 11 && n % 100 <= 13) {
            return "th";
        }
        switch (n % 10) {
            case 1:
                return "st";
            case 2:
                return "nd";
            case 3:
                return "rd";
            default:
                return "th";
        }
    }

    private static char firstUpper(String s, int i) {
        if (i == s.length())
            return '#';
        return (Character.isUpperCase(s.charAt(i))) ? s.charAt(i) : firstUpper(s, i + 1);
    }

    private static int intLog(int n, int base) {
        if (n < base) {
            return 0;
        }
        return 1 + intLog(n / base, base);
    }

    private static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return Integer.MIN_VALUE;
        }
        return n * factorial(n - 1);
    }

    private static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        for (char ch : arr) {
            if (ch == ']' || ch == '}' || ch == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (ch != correspondingBracket(stack.pop())) {
                    return false;
                } else {
                    continue;
                }
            }
            stack.push(ch);
        }
        return stack.isEmpty();
    }

    private static char correspondingBracket(char ch) {
        switch (ch) {
            case '[':
                return ']';
            case '{':
                return '}';
            case '(':
                return ')';
            default:
                return '#';
        }
    }

    private static ArrayList<String> lexiPowerSet(String s, int index, String curr, ArrayList<String> result) {
        if (index == s.length()) {
            result.add(curr);
            return result;
        }
        int n = s.length();

        lexiPowerSet(s, index + 1, curr + s.charAt(index), result);
        lexiPowerSet(s, index + 1, curr, result);

        return result;
    }

}
