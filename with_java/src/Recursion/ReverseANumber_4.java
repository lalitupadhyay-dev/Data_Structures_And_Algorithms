package Recursion;

public class ReverseANumber_4 {
    static int intReversal (int n, int i) {

        if (n < 10) return n;

        int rem = n % 10;
        return (int)(rem * Math.pow(10, i)) + intReversal(n/10, i-1);
    }

    static void stringReversal (int n, StringBuilder sb) {
        if (n == 0) return;

        sb.append(n%10);
        stringReversal(n/10, sb);

    }
    public static void main(String[] args) {
        System.out.println(intReversal(7689, 3));


        StringBuilder sb = new StringBuilder();

        stringReversal(123, sb);

        System.out.println(sb);
    }
}
