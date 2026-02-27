package Strings.medium;

/*
    Problem statement: Count frequency of lower case alphabets in given string.

    I/P: "eeoaacdf"

    O/P: e = 2, o = 1, a = 2, c = 1, d = 1, f = 1

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class LowercaseAlphabetsFrequency {

    public static void count (String str) {
        int[] freq = new int[26];
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < str.length(); ++i) {
            int index = str.charAt(i) - 'a';
            freq[index]++;
        }

        for (int i = 0; i < freq.length; ++i) {
            if (freq[i] > 0) {
                ans.append((char)(i + 'a'))
                   .append(": ")
                   .append(freq[i])
                   .append(", ");
            }
        }

        System.out.println(ans);

    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        count(str);

    }
}
