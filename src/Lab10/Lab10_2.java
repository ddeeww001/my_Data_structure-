package Lab10;

public class Lab10_2 {
    public static int[] q2_2(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] >= b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        while (i < a.length) {
            c[k] = a[i];
            i++;
            k++;
        }

        while (j < b.length) {
            c[k] = b[j];
            j++;
            k++;
        }

        return c;
    }
}
