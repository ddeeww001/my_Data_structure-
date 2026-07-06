package Lab10;

import static Lab10.Lab10_1.q2_1;
import static Lab10.Lab10_2.q2_2;


public class main {
    public static void main(String[] args) {
        System.out.println("Output Question 1");
        int[] b = {24, 13, 26, 1, 2, 27, 38};
        q2_1(b);

        System.out.println("\nOutput Question 2");
        int[] a = {30, 28, 5, 3, 1,0};
        int[] b2 = {29, 27, 5};
        int[] c = q2_2(a, b2);

        for (int i = 0; i < c.length; i++) {
            System.out.print(c[i] + " ");
        }
        System.out.println();
    }

}
