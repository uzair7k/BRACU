public class RecursionB {
    public static void main(String[] args) {
        System.out.println(fibonacciSum(5));
    }
    static int fib(int n) {
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    static int fibonacciSum(int n) {
        if (n == 0) return 0;
        return fib(n) + fibonacciSum(n - 1);
    }
}
