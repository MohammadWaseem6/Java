package PRACTICE;

//fibonacci series
public class RecursionPractice {

    public static void main(String[] args) {
        System.out.println(fibo(10));

    }

    static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n - 1) + fibo(n - 2);// fibo(5)-> this means fibo(4) + fibo(3),fibo(4)->fibo(3) +
                                         // fibo(2),fibo(3)->fibo(2) + fibo(1),fibo(2)->fibo(1) + fibo(0)

    }
}
/* you can prefer this documentation */
// Certainly, let's walk through the process of calculating the Fibonacci number
// for `n = 5` using the given recursive function `fibo(n)`.

// fibo(5)
// ```

// Since `n` is 5, we're going to evaluate `fibo(5)`.

// fibo(4) + fibo(3)
// ```

// Now, we evaluate `fibo(4)` and `fibo(3)`.

// For `fibo(4)`:

// fibo(3) + fibo(2)
// ```

// For `fibo(3)`:

// fibo(2) + fibo(1)
// ```

// For `fibo(2)`:

// fibo(1) + fibo(0)


// At this point, we've reached the base cases:

// fibo(0) = 0
// fibo(1) = 1


// Now, we'll start substituting the values back into the previous equations:

// For `fibo(2)`:

// 1 + 0
// ```

// So, `fibo(2)` equals 1.

// Now, for `fibo(3)`:

// 1 + 1
// ```

// So, `fibo(3)` equals 2.

// For `fibo(4)`:

// 2 + 1
// ```

// So, `fibo(4)` equals 3.

// Finally, for `fibo(5)`:

// 3 + 2
// ```

// So, `fibo(5)` equals 5.

// Therefore, the Fibonacci number at index 5 is 5.
