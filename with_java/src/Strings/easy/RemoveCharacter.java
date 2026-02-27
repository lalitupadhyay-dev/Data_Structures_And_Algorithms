package Strings.easy;

import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        String main;
        Scanner scan = new Scanner(System.in);
        main = scan.next();

        char rm;
        rm = scan.next().charAt(0);

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < main.length(); ++i) {
            if (main.charAt(i) != rm) {
                ans.append(main.charAt(i));
            }
        }

        System.out.println(ans);

    }
}
