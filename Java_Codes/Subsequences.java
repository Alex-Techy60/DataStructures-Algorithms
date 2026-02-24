import java.util.Scanner;

public class Subsequences {
    public static void subsequences(String str, int index, String newStr){
        if(index == str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar = str.charAt(index);
        subsequences(str, index+1, newStr+currChar);
        subsequences(str, index+1, newStr);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String and I'll print all of it's subsequences");
        String str = sc.next();
        subsequences(str, 0, "");
    }
}