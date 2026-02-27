package Strings.easy;

import java.util.Scanner;

public class TrimSpaces {

    public static void main(String[] args) {
        String str;

        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) != ' ') {
                ans.append(str.charAt(i));
            }
        }

        System.out.println(ans);
    }
}
