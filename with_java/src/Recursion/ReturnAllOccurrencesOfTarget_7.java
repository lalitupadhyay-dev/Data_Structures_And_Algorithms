package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class ReturnAllOccurrencesOfTarget_7 {
    static void findAllOccurrences (int[] arr, int target, int i, ArrayList<Integer> ans) {
        if (i == arr.length) {
            return;
        }
        if (arr[i] == target) {
            ans.add(i);
        }
        findAllOccurrences(arr, target, i+1, ans);
    }
    public static void main(String[] args) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] arr = {1, 2, 3, 4, 4, 8};
        findAllOccurrences(arr, 4, 0, ans);
        System.out.println(ans);
    }
}
