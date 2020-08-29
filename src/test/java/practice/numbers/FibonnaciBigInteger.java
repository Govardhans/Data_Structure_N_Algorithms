package practice.numbers;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class FibonnaciBigInteger {

    public static void main(String[] args) {
        int num = 100;
        System.out.println(fibonacci(num).toString());
        for (int i = 0; i <= 17; i++)
            System.out.println(fibonacci_num_check(i) ? i + " is a Fibonacci number" :
                    i + " is a not Fibonacci number");
    }

    //0 1 2 3 4 5 6 7
    //0 1 1 2 3 5 8 13
    private static List<BigInteger> fibonacci(int num) {
        List<BigInteger> fibonacciSeries = new ArrayList<>();
        if (num == 0) {
            fibonacciSeries.add(BigInteger.ZERO);
        }
        fibonacciSeries.add(BigInteger.ZERO);
        BigInteger prevSum1 = BigInteger.ONE;
        BigInteger prevSum2 = BigInteger.ZERO;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 1; i <= num; i++) {
            sum = prevSum1.add(prevSum2);
            fibonacciSeries.add(sum);

            prevSum1 = prevSum2;
            prevSum2 = sum;
        }
        return fibonacciSeries;
    }

    //check if number is fibonnaci series number;
    //0 1 2 3 4 5 6 7
    //0 1 1 2 3 5 8 13
    static boolean perfect_square_check(int val) {
        int s = (int) Math.sqrt(val);
        return (s * s == val);
    }

    static boolean fibonacci_num_check(int n) {
        return perfect_square_check(5 * n * n + 4) || perfect_square_check(5 * n * n - 4);
    }
}