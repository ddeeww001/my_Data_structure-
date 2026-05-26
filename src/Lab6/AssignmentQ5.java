package Lab6;

public class AssignmentQ5 {
    static int[] allNum = {10, 20, 1, 31, 2, -14, 13};
    public static int minRecursion(int min, int index) {
        if (index < 0) {
            return min;
        }
        if (allNum[index] < min) {
            min = allNum[index];
        }
        return minRecursion(min, index - 1);
    }

    public static int minLoop(int min,int index){
    for(int i = 0; i >= index ; i++) {
        if (allNum[i] < min) {
            min = allNum[i];
        }
    }
    return min;
    }


    public static void main(String[] args) {

        //long startTime = System.currentTimeMillis();
        int lastIndex = allNum.length - 1;
        int result1 = minRecursion(allNum[lastIndex], lastIndex);
        //long endTime = System.currentTimeMillis();

        int result2 = minRecursion(allNum[lastIndex], lastIndex);

        System.out.println("return min : " + result1);
        System.out.println("return min : " + result2);
        //System.out.println("Time taken: " + (endTime - startTime) + " ms");


    }
}