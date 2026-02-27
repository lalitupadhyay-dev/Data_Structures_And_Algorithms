package Strings.easy;

import java.util.Scanner;

public class ToggleCase {

    public static void main(String[] args) {
        String str;

        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); ++i) {
            if ((int)str.charAt(i) >= 97 && (int)str.charAt(i) <= 122) {
                ans.append((char)((int)str.charAt(i) - 32));
            } else {
                ans.append((char)((int)str.charAt(i) + 32));
            }
        }
        System.out.println(ans);
    }
}
