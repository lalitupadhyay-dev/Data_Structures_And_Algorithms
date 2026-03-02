package ContestProblems.Contest3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LaxmiChitFund {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(new StringTokenizer(br.readLine()).nextToken());

        int total = 0, min = 0, max = 0, avg = 0;
        int[] arr = new int[n];

        StringTokenizer stz = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(stz.nextToken());
            total += arr[i];
        }

        avg = total / n;

        min = arr[0];
        max = arr[0];
        for (int i = 1; i < n; ++i) {
            if (min > arr[i]) min = arr[i];
            if (max < arr[i]) max = arr[i];
        }

        System.out.println(total + " " + max + " " + min + " " + avg);

    }
}
