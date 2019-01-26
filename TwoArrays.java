package week11;

public class TwoArrays {
    public static void main(String[] args) {
        int arr1[] = {4, 5, 31, 6, 8,};
        int arr2[] = {8, 66, 344, 31, 9, 4};
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
}
