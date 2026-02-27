package Strings.easy;

import java.util.Scanner;

public class Reverse {

    public static void main(String[] args) {

        StringBuilder str = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        str.append(scan.nextLine());

        for (int i = 0, j = str.length() - 1; i < str.length() / 2; ++i, --j) {
            char ch = str.charAt(i);
            str.setCharAt(i, str.charAt(j));
            str.setCharAt(j, ch);
        }

        System.out.println(str);

    }
}
