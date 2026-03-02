package ContestProblems.Contest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GangsterGhafoor {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stz1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stz1.nextToken());
        int m = Integer.parseInt(stz1.nextToken());
        StringBuilder sb = new StringBuilder();

        int[][] arr = new int[n][m];
        for (int i = 0; i < n; ++i) {
            StringTokenizer stz2 = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(stz2.nextToken());
            }
        }
        boolean flag = false;
        for (int i = 0; i < 1; ++i) {
            for (int j = n - 1; j >= 0; --j) {
                if (arr[j][i] != -1) {
                    sb.append(arr[j][i] + " ");
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) break;

            for (int j = 1; j < m; ++j) {
                if (arr[i][j] != -1) {
                    sb.append(arr[i][j] + " ");
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) break;

            for (int j = 1; j < n; ++j) {
                if (arr[j][m - 1] != -1) {
                    sb.append(arr[j][m - 1] + " ");
                } else {
                    flag = true;
                    break;
                }
            }

            if (flag) break;

            for (int j = m - 2; j > 0; --j) {
                if (arr[n - 1][j] != -1) {
                    sb.append(arr[n - 1][j] + " ");
                } else {
                    flag = true;
                    break;
                }
            }

        }

        System.out.println(sb);

    }
}
