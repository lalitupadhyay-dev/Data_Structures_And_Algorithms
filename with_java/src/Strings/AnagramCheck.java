package Strings;

import java.util.HashMap;
import java.util.Map;

/**
 *  Problem Statement: Check whether the strings are permutations of each other or not.
 *  I/P: str1 = "listen", str2 = "silent"
 *  O/P: true
 *
 *  Approach 1: My naive approach, used hashmap for maintaining indexes of duplicate chars.
 *
 *  Approach 2: Sort both strings, and compare them.
 *
 *  Approach 3: Use Hashmap, increase and decrease count for each char of both strings,
 *              into the Hashmap
 */

public class AnagramCheck {

    // My naive approach - [ O(n^2) TC ] | [ O(n) SC ]
    public static boolean isAnagramNaive(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < str1.length(); ++i) {
            Character ch = str1.charAt(i);
            boolean isPresent = false;
            mp.putIfAbsent(ch, -1);
            for (int j = mp.get(ch) + 1; j < str2.length(); ++j) {
                if (ch == str2.charAt(j)) {
                    mp.put(ch, j);
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                return false;
            }
        }
        return true;
    }

    // GFG solution - [ O(n) TC ] | [ O(n) SC ]
    public static boolean isAnagramEfficient (String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        Map<Character, Integer> mp = new HashMap<>();

        for (int i = 0; i < str1.length(); ++i) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            mp.put(ch1, mp.getOrDefault(ch1, 0) + 1);

            mp.put(ch2, mp.getOrDefault(ch2, 0) - 1);
        }

        for (Map.Entry<Character, Integer> entry: mp.entrySet()) {
            if (entry.getValue() != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagramNaive("aab", "aba"));

        System.out.println(isAnagramEfficient("aab", "aaa"));
    }
}
