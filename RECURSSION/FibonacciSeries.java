/**
 * The FibonacciSeries class provides a method to calculate the nth Fibonacci number using a recursive approach.
 * The Fibonacci sequence is a series of numbers where each number is the sum of the two preceding ones, starting from 0 and 1.
 */
public class FibonacciSeries {

    /**
     * Calculates the nth Fibonacci number using a recursive approach.
     *
     * @param n The index of the Fibonacci number to be calculated.
     * @return The nth Fibonacci number.
     */
    public static int Fib(int n) {
        // Base cases: Fibonacci of 0 is 0, and Fibonacci of 1 is 1.
        if (n == 0 || n == 1) {
            return n;
        }
        
        // Calculate the (n-1)th and (n-2)th Fibonacci numbers recursively.
        int fbnm1 = Fib(n - 1);
        int fbnm2 = Fib(n - 2);
        
        // Calculate the nth Fibonacci number by summing the (n-1)th and (n-2)th Fibonacci numbers.
        int fbnm3 = fbnm1 + fbnm2;
        return fbnm3;
    }

    /**
     * The main method demonstrates the usage of the Fib method by calculating and printing the 20th Fibonacci number.
     *
     * @param args Command-line arguments (not used in this context).
     */
    public static void main(String[] args) {
        int n = 20; // The index of the Fibonacci number to be calculated.
        System.out.println("The " + n + "th Fibonacci number is: " + Fib(n));
    }
}
