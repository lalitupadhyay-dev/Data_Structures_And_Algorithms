package Strings.easy;

import java.util.Scanner;

/**
 * You are given a single character.
 * Determine whether it is:
 *  - Lowercase
 *  - Uppercase
 *  - Digit
 *  - Special
 *
 * Input: The only line contains a single character c.
 *
 * It is guaranteed that c is a printable ASCII character (33 ≤ ASCII value of c ≤126).
 *
 * Output: Print exactly one of the following:
 *
 *  - Lowercase
 *  - Uppercase
 *  - Digit
 *  - Special
 */

public class CharsCategoryUsingAscii {

    public static void print(char ch) {

        if ((int) ch >= 97 && (int) ch <= 122) {
            System.out.println("Lowercase");
        } else if ((int) ch >= 65 && (int) ch <= 90) {
            System.out.println("Uppercase");
        } else if ((int) ch >= 48 && (int) ch <= 57) {
            System.out.println("Digit");
        } else {
            System.out.println("Special");
        }

    }

    public static void main(String[] args) {
        char ch;

        Scanner scan = new Scanner(System.in);

        ch = scan.next().charAt(0);

        print(ch);
    }
}
