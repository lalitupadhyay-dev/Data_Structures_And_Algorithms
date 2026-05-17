package Recursion;

public class IsArraySorted_5 {
    static boolean isArraySorted (int[] arr, int i) {

        if (i == arr.length) {
            return true;
        }

        if (arr[i] < arr[i - 1]) {
            return false;
        }

        return isArraySorted(arr, i + 1);
    }
    public static void main(String[] args) {
        int[] arr = {3, 5, 30, 89, 91};
        System.out.println(isArraySorted(arr, 1));
    }
}
