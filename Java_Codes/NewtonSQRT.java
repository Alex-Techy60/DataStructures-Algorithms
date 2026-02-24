import java.util.Scanner;

public class NewtonSQRT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        System.out.println(sqrt(n));
    }
    public static double sqrt(int n){
        double x = n;
        double root;
        while(true){
            root = (x + (n/x))/2;
            if(Math.abs(root - x) < 0.1){
                break;
            }
            x = root;
        }
        return root;
    }
}
