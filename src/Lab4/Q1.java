package Lab4;

import java.util.Random;

public class Q1 {
    public void main(String[]args){
        Random random = new Random();
        int[] myArray = random.ints(100000000,10,10000000).toArray();
        double startTime = System.currentTimeMillis();
        int result = multiplyTheEnd(myArray);
        double endTime = System.currentTimeMillis();

        System.out.println("["+result+"]"+"The method took "+(endTime-startTime)+" milliseconds");
    }

    public static int multiplyTheEnd(int[] arr){
        return arr[arr.length-1]*2;
    }

/*
What is long? and What are the differences between long and other variable types?
ANS: มันเป็นเพราะว่า long รับค่าได้เยอะกว่าค่าอันอื่น เช่น int แต่ถึงอย่างนั้น double ก็มใช้ได้แต่ก็ดูจะไม่จำเป็นเพราะเราไม่ได้ใช้ค่าหลังจุดทศนิยม
-------------------------------------------------------------------------------------------------------
Length of the array |10 |1000 |100000 |100000000
Execution time      |0  |0    |0      |0
*/
}
