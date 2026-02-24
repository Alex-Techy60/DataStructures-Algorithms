import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String currCard = br.readLine();
        char currRank = currCard.charAt(0);
        char currSuit = currCard.charAt(1);
        boolean canPlay = false;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<5; i++){
            String card = st.nextToken();
            if(card.charAt(0) == currRank || card.charAt(1) == currSuit){
                canPlay = true;
                break;
            }
        }
        if(canPlay){
            System.out.println("YES");
        } else{
            System.out.println("NO");
        }
    }    
}
