package Lab10;

public class Lab10_1 {
    public static void q2_1(int[] b) {
        divideAndPrint(b, 0, b.length - 1);
    }

    private static void divideAndPrint(int[] arr, int left, int right) {
        System.out.print("{");
        for (int i = left; i <= right; i++) {
            System.out.print(arr[i] + ",");
        }
        System.out.println("}");
        if (left < right) {
            int mid = left + (right - left) / 2;

            divideAndPrint(arr, left, mid);
            divideAndPrint(arr, mid + 1, right);
        }
    }




}