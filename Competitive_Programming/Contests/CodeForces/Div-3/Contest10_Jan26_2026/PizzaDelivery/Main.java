import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    static class Point {
        int x;
        int y;
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int Ax = Integer.parseInt(st.nextToken());
            int Ay = Integer.parseInt(st.nextToken());
            int Bx = Integer.parseInt(st.nextToken());
            int By = Integer.parseInt(st.nextToken());

            StringTokenizer xCoord = new StringTokenizer(br.readLine());
            StringTokenizer yCoord = new StringTokenizer(br.readLine());

            PriorityQueue<Point> pq = new PriorityQueue<>((a, b) -> a.x - b.x);

            for (int i = 0; i < n; i++) {
                pq.offer(new Point(
                        Integer.parseInt(xCoord.nextToken()),
                        Integer.parseInt(yCoord.nextToken())
                ));
            }

            long result = 0;
            int currX = Ax;
            int currY = Ay;

            while (!pq.isEmpty()) {
                Point p = pq.poll();
                int x = p.x;
                int minY = p.y;
                int maxY = p.y;

                while (!pq.isEmpty() && pq.peek().x == x) {
                    Point q = pq.poll();
                    minY = Math.min(minY, q.y);
                    maxY = Math.max(maxY, q.y);
                }

                result += x - currX;
                currX = x;

                if (currY < minY) {
                    result += (minY - currY) + (maxY - minY);
                    currY = maxY;
                } else if (currY > maxY) {
                    result += (currY - maxY) + (maxY - minY);
                    currY = minY;
                } else {
                    int down = currY - minY;
                    int up = maxY - currY;
                    result += (maxY - minY) + Math.min(down, up);
                    currY = (down < up) ? maxY : minY;
                }
            }

            result += (Bx - currX) + Math.abs(currY - By);
            System.out.println(result);
        }
    }
}
