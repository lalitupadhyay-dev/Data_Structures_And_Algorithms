package Strings.easy;

/*
    Problem statement: Check whether the string is Palindrome or not.
 */

public class PalindromeCheck {

    public static boolean isPalindrome(String str) {

        for (int i = 0, j = str.length() - 1; i < str.length()/2; ++i, --j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String str = "abbba";

        System.out.println(isPalindrome(str));

    }
}
