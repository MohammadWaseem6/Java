public class onetoN {
    static void func(int n) {
        if (n == 0) {
            return;
        }

        // After printing the current value of n, this line recursively calls the func
        // method with the argument n - 1. This is a recursive function call, which
        // means the function calls itself with a decremented value of n. This process
        // continues until n becomes 0.

       // func(n - 1);//12345
        System.out.print(n + " ");
        func(n - 1);//54321
    }

    public static void main(String[] args) {

        func(5);
    }

}
