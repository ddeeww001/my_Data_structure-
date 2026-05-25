package Lab6;

public class AssignmentQ5 {
    int[] data = {10,1000,100000};

    public int forLoop(int dataNum){
        int arr = 0;
        for(int i =0; i< dataNum;i++){
            arr++;
        }
        return arr;
    }

    public void recursion(int dataNum){
            if ( 0 > dataNum) {
                return;
            }
            recursion(dataNum-1);
    }

    public void main(String[]args){
        System.out.println("For loop:");
        for(int i=0;i<data.length;i++) {
            long timeIn1 = System.currentTimeMillis();
            forLoop(data[i]);
            long timeOut1 =  System.currentTimeMillis();

            System.out.println("["+i+"]"+(timeOut1-timeIn1));
        }

        System.out.println("Recursion: ");
        for(int i=0;i<data.length;i++) {
            long timeIn2 = System.currentTimeMillis();
            recursion(data[i]);
            long timeOut2 =  System.currentTimeMillis();

            System.out.println("["+i+"]"+(timeOut2-timeIn2));
        }

    }
    /*
    For loop:
            [0]0
            [1]0
            [2]0
    Recursion:
            [0]0
            [1]0
    Exception in thread "main" java.lang.StackOverflowError
    */

}