import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[][] B = new int[m][n];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                B[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        // Step 1: Initialize A with all 1s
        int[][] A = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = 1;
            }
        }

        // Step 2: For every B[i][j] == 0, set row i and column j of A to 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (B[i][j] == 0) {
                    for (int x = 0; x < n; x++) A[i][x] = 0;
                    for (int x = 0; x < m; x++) A[x][j] = 0;
                }
            }
        }

        // Step 3: Build B' from A
        int[][] Bprime = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int rowOr = 0, colOr = 0;

                for (int x = 0; x < n; x++) rowOr |= A[i][x];
                for (int x = 0; x < m; x++) colOr |= A[x][j];

                Bprime[i][j] = (rowOr | colOr);
            }
        }

        // Step 4: Compare B' with B
        boolean ok = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (Bprime[i][j] != B[i][j]) {
                    ok = false;
                    break;
                }
            }
        }

        if (!ok) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            printArray(A);
        }
    }

    private static void printArray(int[][] A) {
        int m = A.length;
        int n = A[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }
}
