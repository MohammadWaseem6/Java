package OOPS;

public class MethodOverLoading {
    public static void main(String[] args) {
        calculator cal = new calculator();
        System.out.println(cal.sum(1, 2));
        System.out.println(cal.sum((float) 1.2, (float) 3.4));
        System.out.println(cal.sum(1, 2, 3));

    }
}

class calculator {
    public float sum;

    int sum(int a, int b) {
            return a + b;
    }

    float sum(float a, float b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }

}
