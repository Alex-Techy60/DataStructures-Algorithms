
public class Butterfly_pattern{
   public static void main(String args[]){
    int a = 4;
    for(int i=0; i<4; i++){
      for(int j=0; j<=i; j++){
         System.out.print("* ");
      }
      for(int j=(a-1-i)*2; j>=0; j--){
         System.out.print("  ");
      }
      for(int j=0; j<=i; j++){
         System.out.print("* ");
      }
      System.out.println();
    }
    for(int i=a-1; i>=0; i--){
      for(int j=0; j<=i; j++){
         System.out.print("* ");
      }
      for(int j=(a-1-i)*2; j>=0; j--){
         System.out.print("  ");
      }
      for(int j=0; j<=i; j++){
         System.out.print("* ");
      }
      System.out.println();
    }
    
   }
}