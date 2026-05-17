package Recursion;

public class SumOfDigits_3 {

    static int digitSum (int n) {

        if (n < 10) return n;

        return digitSum(n /10) + n % 10;

    }

    public static void main(String[] args) {

        System.out.println(digitSum(12345));

    }
}
