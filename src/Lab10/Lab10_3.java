package Lab10;

import static Lab9.random.nodup_array;

public class Lab10_3 {
    //merge sort
    public static int[] sort_min_to_max(int[] a, int[] b) {
        int len = (a.length + b.length);
        int[] c = new int[len];
        int i = 0; //a
        int j = 0; //b
        int k = 0; //c
        while (true) {
            if (i >= a.length) {
//b remainder
                for (int l = j; l < b.length; l++) {
                    c[k] = b[l];
                    k = k + 1;
                }
                break;
            }
            if (j >= b.length) {
//a remainder
                for (int l = i; l < a.length; l++) {
                    c[k] = a[l];
                    k = k + 1;
                }
                break;
            }
            if (a[i] < b[j]) {
                c[k] = a[i];
                i = i + 1;
            } else {
                c[k] = b[j];
                j = j + 1;
            }
            k = k + 1;
        }
        return c;
    }

    private static void merge(int arr[], int i, int m, int j) {
        int n1 = m - i + 1;
        int n2 = j - m;
// Create temp
        int A[] = new int[n1];
        int B[] = new int[n2];
// Copy data to temp arrays
        for (int k = 0; k < n1; k++) {
            A[k] = arr[i + k];
        }
        for (int k = 0; k < n2; k++) {
            B[k] = arr[m + 1 + k];
        }
        int[] C = sort_min_to_max(A, B);
        int q = 0;
        for (int k = i; k <= j; k++) {
            arr[k] = C[q];
            q = q + 1;
        }
    }

    private static int[] divide(int arr[], int i, int j) {
        if (i < j) {
//middle point
            int m = i + (j - i) / 2;
            divide(arr, i, m);
            divide(arr, m + 1, j);
            merge(arr, i, m, j);
        }
        return arr;
    }

    public static int[] mergesort(int[] a) {
        return divide(a, 0, a.length - 1);
    }

    ///////////////////////////////////
    public static void main(String[]args){
        for (int i = 0; i < 100; i++) {
            int[]a = nodup_array(10000); //from lab7
            long start = System.nanoTime();
            mergesort(a);
            long end = System.nanoTime();
            System.out.println(end - start);
        }
    }
}
