package Strings;

/*
    Problem statement: Check that "str2" is subsequence of "str1" or not.

    1. What is Subsequence?
       -> A sequence that can be derived from the given sequence by deleting
          some or no elements without changing the order of the remaining
          elements.
       -> Total subsequences = (2^n) for length (n) string.

    ****************************************************

    Note: Here the order is maintained.
    I/P (1): str1 = "ABCDE", str2 = "ACE"
    O/P (1): true

    Note: Un-ordered
    I/P (2): str1 = "ABCDE", str2 = "AED"
    O/P (2): false

 */

public class SubsequenceCheck {


    public static boolean isSubsequenceNaiveMine (String str1, String str2) {

        boolean isSubsequence = true;

        /* This variable will track the order.
         * If the prevIndex is greater(>) then the current checking index i.e. (j).
         * this will break the consistency, hence it is not subsequence
         */
        int prevIndex = -1;

        for (int i = 0; i < str2.length(); ++i) {
            boolean isPresent = false;
            for (int j = 0; j < str1.length(); ++j) {
                if ((str2.charAt(i) == str1.charAt(j)) && (j > prevIndex)) {
                    prevIndex = j;
                    isPresent = true;
                    break;
                }
            }

            if (!isPresent) {
                isSubsequence = false;
                break;
            }
        }

        return isSubsequence;
    }

    public static boolean isSubsequenceNaiveGFG (String str1, String str2) {

        boolean isSubsequence = true;

        int i = 0, j = 0;

        while (i < str1.length() && j < str2.length()) {
            if (str1.charAt(i) == str2.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        if (!(j == str2.length())) {
            isSubsequence = false;
        }

        return isSubsequence;
    }

    public static boolean isSubsequenceRecursive (String str1, String str2, int i, int j) {

        if (j == str2.length()) {
            return true;
        }

        if (i == str1.length()) {
            return false;
        }

        if (str1.charAt(i) == str2.charAt(j)) {
            return isSubsequenceRecursive(str1, str2, i+1, j+1);
        } else {
            return isSubsequenceRecursive(str1, str2, i+1, j);
        }
    }

    public static void main(String[] args) {

        String str1 = "ABCDE";
        String str2 = "ABCDE";

        System.out.println(isSubsequenceNaiveMine(str1, str2));

        System.out.println(isSubsequenceNaiveGFG(str1, str2));

        System.out.println(isSubsequenceRecursive(str1, str2, 0, 0));

    }
}
