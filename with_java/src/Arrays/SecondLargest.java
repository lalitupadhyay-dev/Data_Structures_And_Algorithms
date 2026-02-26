package Arrays;

import java.util.Scanner;

public class SecondLargest {

    public static int findSecondLargest (int[] arr) {

        int max = -1, secondMax = -1;
        for (int i = 0; i < arr.length; ++i) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            }
            if (arr[i] < max && arr[i] > secondMax) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = scan.nextInt();
        }

        System.out.println(findSecondLargest(arr));

    }
}
