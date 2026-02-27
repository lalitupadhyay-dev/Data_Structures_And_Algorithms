package Strings.easy;

import java.util.Scanner;

public class Brothers {

    public static boolean areBrothers (String f1, String l1, String f2, String l2) {
        return l1.equals(l2);
    }

    public static void main(String[] args) {

        String f1, l1, f2, l2;

        Scanner scan = new Scanner(System.in);

        f1 = scan.next();
        l1 = scan.next();
        f2 = scan.next();
        l2 = scan.next();

        if (areBrothers(f1, l1, f2, l2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}
