package Recursion;

public class LinearSearch_6 {
    static int linearSearch (int[] arr, int target, int i) {

        if (i == arr.length - 1) return -1;

        if (arr[i] == target) return i;

        return linearSearch(arr, target, i + 1);

    }
    public static void main(String[] args) {
        int[] arr = {4, 7, -2, 90, -8778, 100, 5, -98, 474};
        System.out.println(linearSearch(arr, 100, 0));
    }
}
