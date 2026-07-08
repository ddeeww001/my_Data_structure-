package Lab9;

public class bubble_forLoop {
    public static void bubble(int[] a) {
        int n = a.length;
        //int count = 0;
        boolean swapped = false;

        for (int i = 0; i < n - 1; i++) {
           // count++;
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                   // count++;
                    swapped = true;
                }

            }
            if (swapped == false) {
               // System.out.println(count);
                break;
            }
        }
    }

    public static void main(String[] args) {
        int[] b = { 0, 12, 32, 10, 5, 67 };
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.print("Bubble: ");
        bubble(b);
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
