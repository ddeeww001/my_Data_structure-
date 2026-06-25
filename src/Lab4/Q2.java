package Lab4;

import java.util.Arrays;
import java.util.Random;

public class Q2 {
    public static void main(String[]args){
        Random random = new Random();
        int[] myArray = random.ints(1000,10,10000000).toArray();
        long startTime = System.currentTimeMillis();
        long result = summation(myArray);
        long endTime = System.currentTimeMillis();

        System.out.println("["+result+"]"+"The method took "+(endTime-startTime)+" milliseconds");
    }
    public static int summation(int[] arr){
        return Arrays.stream(arr).sum();
    }
    /*
    Length of the array |10 |1000 |100000 |100000000
    Execution time      |0-2|0-2  |0-2    |31-36
    */

}
