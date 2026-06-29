package Lab9;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class random {
    public static int[] nodup_array(int n) {
        int[] a = new int[n];
        List<Integer> List1 = new LinkedList<>();
        for (int i = 1; i <= a.length; i++) {
            List1.add(i);
        }
        int count = 1;
        //while (List1.size() != 0) {
            for (int i = 1; i <= List1.size(); i++) {
                Random random = new Random();
                int x = random.nextInt(List1.size());
                int num = i-1;
                a[num] = x;
                System.out.println("[" + count + "]" + a[num]);
                count = count + 1;
           // }

        }return a;


    }

    public static void main(String[] args) {
        System.out.println("Question 1| Random");
        nodup_array(100);


    }

}


