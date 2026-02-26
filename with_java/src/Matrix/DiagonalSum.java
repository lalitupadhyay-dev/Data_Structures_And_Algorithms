package Matrix;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class DiagonalSum {

    public static int diagonalSum(int[][] arr) {

        int sum = 0;

        for(int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[0].length; ++j) {
                if (i == j) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;

    }

    public static void main(String[] args) throws Exception {
        int n;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());

        int[][] arr = new int[n][n];

        for (int i = 0; i < n; ++i) {
            StringTokenizer stz = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; ++j) {
                arr[i][j] = Integer.parseInt(stz.nextToken());
            }
        }

        System.out.println(diagonalSum(arr));
    }
}
