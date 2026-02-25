package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 *  Problem Statement: Find the leftmost repeating character and print the index.
 *  I/P: str = "abccb"
 *  O/P: 1
 *
 *  Approach 1: Check character by character in 2 for loops, where matched print & return instantly.
 *
 */

public class LeftmostRepeatingCharacter {

    // [ O(n^2) TC]
    public static void leftmostCharNaive (String str) {
        for (int i = 0; i < str.length() - 1; ++i) {
            boolean found = false;
            for (int j = i + 1; j < str.length(); ++j) {
                if (str.charAt(i) == str.charAt(j)) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }

    public static void leftmostCharEfficientMine (String str) {
        Map<Character, Integer[]> mp = new HashMap<>();
        for (int i = 0; i < str.length(); ++i) {
            if (mp.get(str.charAt(i)) != null) {
                Integer[] arr = mp.get(str.charAt(i));
                arr[0]++;
                mp.put(str.charAt(i), arr);
            }
            mp.putIfAbsent(str.charAt(i), new Integer[]{1, i});
        }

        int index = -1;
        boolean firstPass = false;
        for (Map.Entry<Character, Integer[]> entry: mp.entrySet()) {
            if (!firstPass) {
                if (entry.getValue()[0] >= 2) {
                    index = entry.getValue()[1];
                    firstPass = true;
                }
            } else {
                if (entry.getValue()[0] >= 2 && entry.getValue()[1] < index) {
                    index = entry.getValue()[1];
                }
            }
        }

        System.out.println(index);

    }

    public static void main(String[] args) {
        String str1 = "geeksforgeeks";
        String str2 = "cabbad";
        String str3 = "abccb";
        String str4 = "abcd";

        leftmostCharNaive(str2);
    }
}
