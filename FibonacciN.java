package week11;

public class FibonacciN {
    public static int fibo(int n) {
        int a = 0;
        int b = 1;
        int temp;

        for (int i = 2; i <= n; i++) {
            temp = a + b;
            a = b;
            b = temp;
        }
        return b;

    }

    public static void main(String[] args) {
        int n = 3;
        System.out.println(fibo(n));
    }
}
