package Lab9;

import static Lab9.random.nodup_array;

public class test_bubble_sort {

    public static int[] bubble(int arr[])
    {
        int n = arr.length;
        int i, j, temp;
        boolean swapped;
        for (i = 0; i < n - 1; i++) {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            if (swapped == false)
                break;
        }
        return arr;
    }

    static void main(String[] args) {
//q1.2
        for (int i = 0; i < 100; i++) {
            int[] a = nodup_array(10);
            long start = System.nanoTime();
            bubble(a);
            long end = System.nanoTime();
            System.out.println("-----------------------------------");
            System.out.println(end - start);
            System.out.println("-----------------------------------");
        }
    }

}
