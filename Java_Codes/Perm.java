import java.util.Scanner;
import java.util.HashSet;

public class Perm {
    public static void printperm(String str, String newstr, HashSet<String> set){
        if(str.length()==0){
            if(!set.contains(newstr)){
                set.add(newstr);
                System.out.println(newstr);
            }
            return;
        }
        for(int i=0; i<str.length(); i++){
            printperm(str.substring(0,i)+str.substring(i+1), newstr+str.charAt(i), set);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        System.out.println("Enter a string and I'll print all of it's unique permutations");
        String str = sc.next();
        System.out.println("The permutations are : ");
        printperm(str, "", set);
    }
}