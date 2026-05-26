package Lab6;

public class AssignmentQ6 {
    public void main(String[]args){
        int[] allNum = {-3,0,1,30,40};
        for (int i=0;i<allNum.length;i++){
            long start1 = System.currentTimeMillis();
            int num1 = fibonacciRecursion(allNum[i]);
            long end1 = System.currentTimeMillis();
            System.out.println("["+i+"]"+(end1-start1)+" recursion ->"+num1);
        }
        System.out.println();
        /*
        ----fibonacciRecursion----
        [0]0 recursion ->1
        [1]0 recursion ->55
        [2]360 recursion ->102334155
        */

        for (int i=0;i<allNum.length;i++) {
            long start2 = System.currentTimeMillis();
            int num2 = fibonacciLoop(allNum[i]);
            long end2 = System.currentTimeMillis();
            System.out.println("[" + i + "]" + (end2 - start2) + " For loop ->" + num2);
        }
        /*
        [0]0 For loop ->-3
        [1]0 For loop ->0
        [2]0 For loop ->1
        [3]0 For loop ->832040
        [4]0 For loop ->102334155
        */
    }

    public int fibonacciRecursion(int index){
        if(index < 0){
            return index;
        }else if(index == 0){
            return 0;
        }else if(index == 1){
            return 1;
        }else {
         return fibonacciRecursion(index - 1) + fibonacciRecursion(index - 2);}
    }

    public int fibonacciLoop(int index) {
        int num1 = 1;
        int num2 = 0;
        int current = 0;
        if (index < 0) {
            return index;
        } else if (index == 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            for (int i = 2; i <= index; i++) {
                current = num1 + num2;
                num2 = num1;
                num1 = current;
            }
        }return current;
    }

}
