package practice.numbers;

public class Factorial {
    public static void main(String[] args) {
        int num = 9;
        if(num < 0){
            System.out.println("cann't calculate -ve number factorial");
        }
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " = " + fact);

    }

    private static int factorial(int num) {

        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }
}
