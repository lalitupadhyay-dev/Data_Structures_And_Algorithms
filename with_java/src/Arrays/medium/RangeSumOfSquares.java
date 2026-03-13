package Arrays.medium;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RangeSumOfSquares {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n, q;
        StringTokenizer stz1 = new StringTokenizer(br.readLine());
        n = Integer.parseInt(stz1.nextToken());
        q = Integer.parseInt(stz1.nextToken());

        int[] arr = new int[n];

        StringTokenizer stz2 = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(stz2.nextToken());
        }

        long[] pSum = new long[n];
        long sqSum = 0L;
        for (int i = 0; i < n; ++i) {
            sqSum = sqSum + ((long) arr[i] * arr[i]);
            pSum[i] = sqSum;
        }

        while(q > 0) {
            StringTokenizer stz3 = new StringTokenizer(br.readLine());
            int l, r;
            l = Integer.parseInt(stz3.nextToken());
            r = Integer.parseInt(stz3.nextToken());

            if ((l - 1) == 0) System.out.println(pSum[r - 1]);
            else {
                System.out.println(pSum[r - 1] - pSum[l - 2]);
            }
            q--;
        }
    }
}
