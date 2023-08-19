public class RecurssionBasics {
    public static void PrintDec(int n) {
        if (n == 1) {// BaseCase
            System.out.println(" " + n);
            return;
        }
        // PrintDec(n - 1);//increasing order
        System.out.print(" " + n);
        PrintDec(n - 1); // decereasing order
    }

    public static void main(String[] args) {
        int n = 10;
        PrintDec(n);
    }
}
