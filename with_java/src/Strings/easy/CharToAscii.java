package Strings.easy;

import java.util.Scanner;

/**
 * You are given a single character c.
 * Print the ASCII value of c.
 *
 * Input: The input contains a single character c.
 *
 * It is guaranteed that c is a visible ASCII character
 * (its code is between 33 and 126).
 *
 * Output: Print a single integer — the ASCII value of c.
 */

public class CharToAscii {

    public static void convert (char ch) {

        System.out.println((int) ch);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char ch = scan.next().charAt(0);

        convert(ch);

    }
}
