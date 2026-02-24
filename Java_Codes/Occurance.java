import java.util.Scanner;

public class Occurance {

   public static void occurance(String str, char character) {
      int first = -1;
      int last = -1;
      int n = str.length();
      for (int i = 0; i < n; i++) {
         char ch = str.charAt(i);
         if (ch == character) {
            if (first == -1) {
               first = i;
            }
            last = i;
         }
      }
      System.out.println("The first occurance of the word is : " + first);
      System.out.println("The last occurance of the word is : " + last);
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your String");
      String str = sc.next();
      System.out.println("Enter your character");
      char character = sc.next().charAt(0);
      occurance(str, character);
   }
}
