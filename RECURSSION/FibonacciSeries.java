public class FibonacciSeries {

    public static int Fib(int n) {
        // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1.
        if (n == 0 || n == 1) {
            return n;
        }

        return Fib(n-1)+(n-2);
    }

    public static void main(String[] args) {
        int n = 20; // The index of the Fibonacci number to be calculated.
        System.out.println("The " + n + "th Fibonacci number is: " + Fib(n));
    }
}
