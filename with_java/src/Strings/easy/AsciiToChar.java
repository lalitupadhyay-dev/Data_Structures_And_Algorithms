package Strings.easy;

import java.util.Scanner;

/**
 * You are given an integer representing the ASCII value of a character.
 *
 * Your task is to print the corresponding character.
 *
 * Input: The only line contains an integer X (33 ≤ X ≤ 126).
 *
 * Output: Print the character corresponding to the given ASCII value.
 */

public class AsciiToChar {

    public static void convert (int x) {

        System.out.println((char)x);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();

        convert(x);

    }
}
