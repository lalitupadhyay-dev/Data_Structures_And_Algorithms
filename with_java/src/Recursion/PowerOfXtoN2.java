package Recursion;

public class PowerOfXtoN2 {

    static int pow (int x, int n) {

        if (n == 0) return 1;

        int ans = pow (x*x, n>>1);

        if (n % 2 == 1) {
            ans *= x;
        }

        return ans;

    }

    public static void main(String[] args) {
        System.out.println(pow(2, 30));
    }
}
