package Strings.easy;

import java.util.Scanner;

/**
 * You are given two words A and B.
 *
 * The word A is said to come before B in lexicographical order (dictionary order) if:
 * at the first position where they differ, A has a smaller character than B, or
 * A is a prefix of B and A ≠ B.
 * Determine which word appears first in the dictionary.
 *
 * Input: The first line contains a word A.
 * The second line contains a word B.
 *
 * Both words contain only lowercase English letters and have length from 1 to 1000.
 *
 * Output:
 * Print A if A comes before B.
 * Print B if B comes before A.
 * Print Equal if A = B.
 */

public class LexicographicalOrder {

    public static void main(String[] args) {
        String a, b;
        Scanner scan = new Scanner(System.in);
        a = scan.next();
        b = scan.next();

        int ans = a.compareTo(b);

        if (ans == 0) {
            System.out.println("Equal");
        } else if (ans < 0) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }

    }
}
