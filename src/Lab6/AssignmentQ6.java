package Lab6;

public class AssignmentQ6 {
    public void main(String[]args){
        int allNum = 10;

            printFibonacciRecursive(0,allNum);

        System.out.println();

           // System.out.println(fibonacciLoop(allNum));
        }




    public static int fibonacciRecursion(int index) {
        if (index <= 0) {
            return 0;
        } else if (index == 1) {
            return 1;
        } else {
            return fibonacciRecursion(index - 1) + fibonacciRecursion(index - 2);
        }
    }

    // 2. ฟังก์ชันแสดงผลลัพธ์ (ใช้ Recursion แทนการใช้ for loop)
    // รับค่า current (ตำแหน่งปัจจุบัน) และ end (ตำแหน่งสุดท้ายที่ต้องการพิมพ์)
    public static void printFibonacciRecursive(int current, int end) {
        // Base Case: ถ้าตำแหน่งปัจจุบัน เกิน ตำแหน่งสุดท้าย ให้หยุดการทำงาน
        if (current > end) {
            return;
        }
        System.out.print(fibonacciRecursion(current) + " ");
        printFibonacciRecursive(current + 1, end);
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
                System.out.print(current+" ");
            }
        }return current;
    }

}
