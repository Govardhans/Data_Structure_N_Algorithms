package practice;

public class FibonnaciSeries {
    // 0 1 2 3 4 5 6 7  8  9  10
    // 0 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        int n = 10;
        int numberToCheck = 13;
        System.out.println( fibonnaci(n));
    }

    private static long fibonnaci(int n) {
        long prevSum1 = 1;
        long prevSum2 = 1;
        long sum = 0;
        if (n == 0) {
            return sum;
        }
        if (n == 1 || n == 2)
            return 1;
        for(int i = 3; i <= n; i++){
            sum = prevSum1+prevSum2;
            prevSum1 =prevSum2;
            prevSum2 = sum;
        }
        return sum;
    }


}
