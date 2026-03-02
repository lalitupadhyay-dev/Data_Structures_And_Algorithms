package ContestProblems.Contest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SumAlongAndBeyondDiagonals {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        int[][] arr = new int[n][n];
        long total = 0L;
        for (int i = 0; i < n; ++i) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(stz.nextToken());
                total += arr[i][j];
            }
        }

        long dl = 0L, dr = 0L;
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                if(i == j) {
                    dl += arr[i][j];
                } else if (j == (n - 1 - i)) {
                    dr += arr[i][j];
                }
            }
        }

        System.out.println(dl + dr + " " + (total - (dl + dr)));

    }
}
