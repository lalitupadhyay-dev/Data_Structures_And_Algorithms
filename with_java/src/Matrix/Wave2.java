package Matrix;

/*
Problem statement:
You are given a 2D array of size n×m containing integers.

Your task is to print all the elements of the matrix column by column in wave form:
Print the first column from top to bottom, the second column from bottom to top,
and so on...

Input:
The first line contains two integers n and m (1 ≤ n, m ≤ 1000).

The next n lines each contain m integers, the elements of the matrix.
All elements satisfy 0 ≤ ai, j ≤ 105.

Output:
Print the expected wave form, as shown in the example.

Examples:
I/P:
3 3
1 2 3
4 5 6
7 8 9

O/P:
1 4 7 8 5 2 3 6 9
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Wave2 {

    public static void solve (int[][] arr, StringBuilder sb) {
        for (int i = 0; i < arr[0].length; ++i) {
            if (i % 2 == 0) {
                for (int j = 0; j < arr.length; ++j) {
                    sb.append(arr[j][i]).append(" ");
                }
            } else {
                for (int j = arr.length - 1; j >= 0; --j) {
                    sb.append(arr[j][i]).append(" ");
                }
            }
        }
    }

    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n, m;

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());

        int[][] arr = new int[n][m];

        for (int i = 0; i < n; ++i) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        solve(arr, sb);

        System.out.print(sb);

    }
}
