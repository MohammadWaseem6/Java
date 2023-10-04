public class Factorial {

    static int fact(int n) {
        if (n <= 1) {
            return n;
        }
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
/*


         fact(5)
        /     \
  5 * fact(4)  fact(4)
              /     \
       4 * fact(3)  fact(3)
                  /     \
           3 * fact(2)  fact(2)
                      /     \
               2 * fact(1)  fact(1)
                          /     \
                       n/a     1 (base case)


 */