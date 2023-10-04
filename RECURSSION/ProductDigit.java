public class ProductDigit {

    static int prod(int n) {
        if (n % 10 == n) {
            return n;
        }
        return n % 10 * prod(n / 10);
    }

    public static void main(String[] args) {
        int n = 12435;
        System.out.println(prod(n));
    }

}
