package recursion;

public class Fibonacci {
    /** 题目描述：斐波那契数列 **/
    public int fibonacci(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2)
            return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }


    public static void main(String[] args) {
        Fibonacci fib = new Fibonacci();
        System.out.println(fib.fibonacci(1));
        System.out.println(fib.fibonacci(2));
        System.out.println(fib.fibonacci(3));
        System.out.println(fib.fibonacci(4));
        System.out.println(fib.fibonacci(5));
    }
}
