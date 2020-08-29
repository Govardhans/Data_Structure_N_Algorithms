package practice.numbers;

import java.math.BigInteger;

public class FactorialBigInteger {

    public static void main(String[] args) {
        int num = 100;
        System.out.println(fact(10));

    }

    public static BigInteger fact(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        }
        return BigInteger.valueOf(n).multiply(fact(n - 1));
    }
}
