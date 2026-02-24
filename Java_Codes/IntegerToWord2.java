import java.util.Scanner;

public class IntegerToWord2 {

    private static final String[] BELOW_TWENTY = {
        "", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
        "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",
        "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"
    };

    private static final String[] TENS = {
        "", "", "Twenty", "Thirty", "Forty", "Fifty",
        "Sixty", "Seventy", "Eighty", "Ninety"
    };

    private static final String[] THOUSANDS = {
        "", "Thousand", "Million", "Billion"
    };

    public static String numberToWords(int num) {
        if (num == 0) return "Zero";

        StringBuilder sb = new StringBuilder();
        int i = 0;

        while (num > 0) {
            if (num % 1000 != 0) {
                StringBuilder part = new StringBuilder();
                helper(num % 1000, part);
                sb.insert(0, part.append(THOUSANDS[i]).append(" "));
            }
            num /= 1000;
            i++;
        }

        return sb.toString().trim();
    }

    private static void helper(int num, StringBuilder sb) {
        if (num == 0) return;
        if (num < 20) {
            sb.append(BELOW_TWENTY[num]).append(" ");
        } else if (num < 100) {
            sb.append(TENS[num / 10]).append(" ");
            helper(num % 10, sb);
        } else {
            sb.append(BELOW_TWENTY[num / 100]).append(" Hundred ");
            helper(num % 100, sb);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(numberToWords(n));
    }
}
