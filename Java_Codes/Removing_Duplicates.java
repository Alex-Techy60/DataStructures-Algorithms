import java. util.Scanner;

public class Removing_Duplicates {
    public static void remDup(String str, String newStr){
        if(str.length()==0){
            System.out.println(newStr);
            return;
        }
        if(newStr.length()==0){
            remDup(str.substring(1, str.length()), newStr+str.charAt(0));
        } else{
            for(int i=0; i<newStr.length(); i++){
                if(str.charAt(0)==newStr.charAt(i)){
                    remDup(str.substring(1, str.length()), newStr);
                    break;
                } else if(i==newStr.length()-1){
                    remDup(str.substring(1, str.length()), newStr+str.charAt(0));
                }
            }
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word, and I'll remove it's duplicates");
        String str = sc.next();
        remDup(str, "");
        
    }
}
