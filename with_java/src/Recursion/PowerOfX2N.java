package Recursion;

public class PowerOfX2N {

    static int pow (int x, int n) {

        if (n == 1) return x;

        int p = pow(x, n - 1);

        p *= x;

        return p;

    }

    public static void main(String[] args) {
        System.out.println(pow(3, 5));
    }

}
