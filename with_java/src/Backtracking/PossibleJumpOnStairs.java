package Backtracking;

import java.util.ArrayList;

public class PossibleJumpOnStairs {
    static void jump (int j, int n, ArrayList<Integer> arr) {
        if (j == n) {
            for (Integer ele: arr) {
                System.out.print(ele + " ");
            }
            System.out.println();
            return;
        }
        if (j > n) {
            return;
        }
        arr.add(1);
        jump(j + 1, n, arr);
        arr.removeLast();

        arr.add(2);
        jump(j + 2, n, arr);
        arr.removeLast();
    }

    public static void main(String[] args) {
        int n = 4;
        ArrayList<Integer> arr = new ArrayList<>();
        jump(0, n, arr);
    }
}
