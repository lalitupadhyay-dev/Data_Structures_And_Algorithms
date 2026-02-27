package Strings.easy;

import java.util.Scanner;

public class CountWords {

    public static void main(String[] args) {
        String a;
        Scanner scan = new Scanner(System.in);
        a = scan.nextLine();
        int cnt = 1;
        for (int i = 0; i < a.length(); ++i) {
            if (a.charAt(i) == ' ') {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
