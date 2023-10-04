public class ReverseNo {
    static void RevNum(int n) {
        if (n < 10) {
            System.out.print(n);
            return;
        } else {
            System.out.print(n % 10);

            RevNum(n / 10);
        }
    }

    public static void main(String[] args) {
        int n = 12345;
        RevNum(n);

    }

}
