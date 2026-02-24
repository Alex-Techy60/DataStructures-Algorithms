import java.util.Scanner;

public class Moving_a_char_at_End {
    public static String moveAllchar(String str, String newstr, char ch, int c){
        if(str.length()==0){
            for(int i=0; i<c; i++){
                newstr += ch;
            }
            return newstr;
        }
        if(str.charAt(0)==ch){
            return moveAllchar(str.substring(1, str.length()), newstr, ch, c+1);
        } else {
            return moveAllchar(str.substring(1, str.length()), newstr+str.charAt(0), ch, c);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and I'll move one of it's character at the end");
        String str = sc.next();
        System.out.println("Enter the character you wanna move in the end");
        char c = sc.next().charAt(0);
        String newstr = moveAllchar(str, "", c, 0);
        System.out.println("The new string is :  " + newstr);
    }
}