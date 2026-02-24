import java.util.Scanner;

public class Print_occurance {
    public static int first = -1;
    public static int last = -1;
    public static void occurance(String str, char check, int index){
        if(index == str.length()){
            System.out.println("First occurance = " + first);
            System.out.println("Last occurance = " + last);
            return;
        }
        if(str.charAt(index)==check){
            if(first == -1){
            first = index;
            }
            last = index;
        }
        occurance(str, check, index+1);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String");
        String str = sc.next();
        System.out.println("Enter your character");
        char check = sc.next().charAt(0);
        occurance(str, check, 0);
    }
}