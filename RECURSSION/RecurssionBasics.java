public class RecurssionBasics {
    public static void PrintDec(int n) {
        if (n == 1) {// BaseCase
            System.out.println(" " + n);
            return;
        }
        System.out.print(" " + n);
        PrintDec(n - 1);// recurssive case
    }

    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
    }
}
