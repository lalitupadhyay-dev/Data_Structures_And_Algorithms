package Strings.medium;

import java.util.Arrays;

public class LeftmostNonRepeatingChar {

    public static int find (String s) {

        short[] hash = new short[26];

        boolean[] visited = new boolean[26];

        for (int i = 0; i < s.length() - 1; ++i) {
            boolean found = false;
            for (int j = i + 1; j < s.length(); ++j) {
                if (s.charAt(i) == s.charAt(j) && !visited[s.charAt(i) - 'a']) {
                    visited[s.charAt(i) - 'a'] = true;
                    found = true;
                    break;
                }
            }

            if (!found && !visited[s.charAt(i) - 'a']) {
                return i;
            }

        }

        return -1;
    }

    public static void main(String[] args) {
        String s1 = "geeksforgeeks";
        String s2 = "abcabc";
        String s3 = "apple";

        System.out.println(find(s3));

    }
}
