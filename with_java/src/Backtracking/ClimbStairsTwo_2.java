package Backtracking;

import java.util.ArrayList;

public class ClimbStairsTwo_2 {
    static void climb (int n, int k, int curr, ArrayList<Integer> path) {
        if (curr == n) {
            System.out.println(path);
        }

        if (curr > n) {
            return;
        }

        for (int i = 1; i <= k; ++i) {
            path.add(i);
            climb(n, k, curr+i, path);
            path.removeLast();
        }

    }
    public static void main(String[] args) {
        int n = 4, k = 3;
        ArrayList<Integer> path = new ArrayList<>();
        climb(n, k, 0, path);
    }
}
