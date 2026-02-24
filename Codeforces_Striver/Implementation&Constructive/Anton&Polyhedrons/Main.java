import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[5];
        for(int i=0; i<n; i++){
            switch(br.readLine()){
                case "Tetrahedron": arr[0]++;
                break;
                case "Cube": arr[1]++;
                break;
                case "Octahedron": arr[2]++;
                break;
                case "Dodecahedron": arr[3]++;
                break;
                case  "Icosahedron": arr[4]++;
                break;
                default: break;
            }
        }
        int result = arr[0] * 4 + arr[1] * 6 + arr[2] * 8 + arr[3] * 12 + arr[4] * 20;
        System.out.println(result);
    }
}
