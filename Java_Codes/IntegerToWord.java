import java.util.Scanner;

public class IntegerToWord {

    public static String numberToWords(int num) {
        if (num == 0) {
            return "Zero";
        }

        StringBuilder sb = new StringBuilder();
        helper(num, sb);
        return sb.toString().trim();
    }

    private static void helper(int n, StringBuilder sb) {
        if (n == 0) return;

        if (n >= 1_000_000_000) {
            int temp = n / 1_000_000_000;
            intToWord(temp, sb);
            sb.append("Billion ");
            n %= 1_000_000_000;
        }
        if (n >= 1_000_000) {
            int temp = n / 1_000_000;
            intToWord(temp, sb);
            sb.append("Million ");
            n %= 1_000_000;
        }
        if (n >= 1_000) {
            int temp = n / 1_000;
            intToWord(temp, sb);
            sb.append("Thousand ");
            n %= 1_000;
        }
        if (n > 0) {
            intToWord(n, sb);
        }
    }

    private static void intToWord(int n, StringBuilder sb) {
        if (n >= 100) {
            sb.append(getUnit(n / 100)).append(" Hundred ");
            n %= 100;
        }

        if (n >= 10 && n < 20) {
            sb.append(getTeen(n)).append(" ");
            return;
        }

        if (n >= 20) {
            sb.append(getTens(n / 10)).append(" ");
            n %= 10;
        }

        if (n > 0 && n < 10) {
            sb.append(getUnit(n)).append(" ");
        }
    }

    private static String getUnit(int n) {
        switch (n) {
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            default: return "";
        }
    }

    private static String getTeen(int n) {
        switch (n) {
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
            default: return "";
        }
    }

    private static String getTens(int n) {
        switch (n) {
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
            default: return "";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        System.out.println(numberToWords(n));
    }
}
