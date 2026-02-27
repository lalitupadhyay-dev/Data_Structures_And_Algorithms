package Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BoundaryTraversal {

    public static void traverse (int[][] arr) {
        for (int i = 0; i < 1; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                System.out.print(arr[0][j] + " ");
            }

            for (int j = 1; j < arr.length; ++j) {
                System.out.print(arr[j][arr[0].length - 1] + " ");
            }

            if (arr.length - 1 != 0) {
                for (int j = arr[0].length - 2; j >= 0; --j) {
                    System.out.print(arr[arr.length - 1][j] + " ");
                }
            }

            if (arr[0].length - 1 != 0) {
                for (int j = arr.length - 2; j > 0; --j) {
                    System.out.print(arr[j][0] + " ");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, m;

        StringTokenizer stz1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stz1.nextToken());
        m = Integer.parseInt(stz1.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; ++i) {
            StringTokenizer stz2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(stz2.nextToken());
            }
        }

        traverse(arr);
    }
}
