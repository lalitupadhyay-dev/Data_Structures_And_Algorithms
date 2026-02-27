package Strings.easy;

import java.util.Scanner;

/**
 * You are given a single English alphabet character.
 * Your task is to convert it to lowercase.
 *
 * Input: The only line contains a single character c.
 *
 * It is guaranteed that c is an English alphabet letter (A ≤ c ≤ Z or a ≤ c ≤ z).
 *
 * Output: Print the lowercase version of the given character.
 */

public class ConvertToLowercase {

    public static void convert (char ch) {
        if ((int) ch >= 97 && (int) ch <= 122) {
            System.out.println(ch);
        } else {
            System.out.println((char)((int)ch + 32));
        }
    }

    public static void main(String[] args) {
        char ch;
        Scanner scan = new Scanner(System.in);

        ch = scan.next().charAt(0);

        convert(ch);
    }
}
