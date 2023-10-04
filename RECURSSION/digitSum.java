public class digitSum {

    static int digitSums(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + digitSums((n / 10) );
    }

    public static void main(String[] args) {
        int n = 1342;
        System.out.println(digitSums(n));
    }

}
