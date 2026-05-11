package Lab3;

import java.util.LinkedList;
import java.util.Scanner;

public class Question5 {
    public static void main(String[]ags) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            LinkedList<String> diamond = new LinkedList<>();
            System.out.print("User enters ");
            int n = scanner.nextInt();

            if(n==1){
                System.out.println("+");
                continue;
            }

            if(n%2 == 0){n+=1;}
            int center = n / 2;

            for (int i = 0; i < n; i++) {
                int dist = Math.abs(center - i); //[Math.abs] ทำให้ค่าเป็นจำนวนเต็มบวกเสมอ
                StringBuilder line = new StringBuilder();//[StringBuilder]https://www.geeksforgeeks.org/java/stringbuilder-class-in-java-with-examples/

                for (int j = 0; j <= dist; j++) {
                    line.append(" ");
                }

                dist = Math.abs((dist * 2) - n);
                for (int k = 0; k < dist; k++) {
                    line.append("+");
                }
                diamond.add(line.toString());//[วิธีใช้ toString] https://www.geeksforgeeks.org/java/string-tostring-method-in-java/
            }

            for (String row : diamond) {
                System.out.println(row);
            }

        }
    }
}

