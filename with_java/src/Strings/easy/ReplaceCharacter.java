package Strings.easy;

import java.util.Scanner;

public class ReplaceCharacter {

    public static void main(String[] args) {
        StringBuilder main = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        main.append(scan.next());

        char from, to;
        from = scan.next().charAt(0);
        to = scan.next().charAt(0);

        for (int i = 0; i < main.length(); ++i) {
            if (main.charAt(i) == from) {
                main.setCharAt(i, to);
            }
        }

        System.out.println(main);

    }
}
