import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String start = br.readLine();
        String end = br.readLine();
        int h1 = Integer.parseInt(start.substring(0, 2));
        int m1 = Integer.parseInt(start.substring(3));
        int h2 = Integer.parseInt(end.substring(0, 2));
        int m2 = Integer.parseInt(end.substring(3));
        int hours = h2 - h1;
        int minutes = m2 - m1;
        if(minutes < 0) {
            hours--;
            minutes += 60;
        }
        int duration = hours * 60 + minutes;
        int mid = duration / 2;
        int h3 = h1 + (m1 + mid) / 60;
        int m3 = (m1 + mid) % 60;
        StringBuilder sb = new StringBuilder();
        if(h3 < 10) {
            sb.append(0);
        }
        sb.append(h3);
        sb.append(':');
        if(m3 < 10) {
            sb.append(0);
        }
        sb.append(m3);
        System.out.println(sb);
    }
}
