package week11;

public class BiggestNumber {
    public static void main(String[] args) {

        int bigestNumber[] = {4, 6, 76, 5, 33, 87, 9};
        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < bigestNumber.length; i++) {
            if (bigestNumber[i] > a) {
                c = b;
                b = a;
                a = bigestNumber[i];

            } else if (bigestNumber[i] > b) {
                c = b;
                b = bigestNumber[i];
            } else if (bigestNumber[i] > c) {
                c = bigestNumber[i];
            }
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
