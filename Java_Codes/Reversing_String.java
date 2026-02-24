import java.util.Scanner; 

public class Reversing_String {
    public static String revstring(String revstr, String str){
        if(str.length()==0){
            return revstr;
        }
        return revstring(revstr+str.charAt(str.length()-1), str.substring(0,str.length()-1));
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and I'll print it's reverse");
        String str = sc.next();
        String reversed_String = revstring("", str);
        System.out.println("The reversed string is :  " + reversed_String);
    }   
}