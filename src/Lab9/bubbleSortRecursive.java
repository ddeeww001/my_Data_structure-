package Lab9;

public class bubbleSortRecursive {
    public static int[] bubbleSort(int[]n){
        bubble(n,0,0);
        return  n;
    }

//    public static void bubble(int[]array,int j,int i, boolean swaped){
//        swaped = false;
//        if(array[j]>array[j+1]){
//            int temp = array[j];
//            array[j] = array[j+1];
//            array[j+1] = temp;
//            bubble(array,j+1,i+1,true);
//        }
//        if( i == array.length-1){
//            return;
//        }
//        if(swaped == false)ฐ
//            bubble(array,j-1,j,false);
//        }}




        public static void bubble(int[] array, int i, int j) {
        // 1. Base Case (จุดสิ้นสุดการทำงาน)
        // ถ้าจำนวนรอบ (i) เท่ากับขนาดของ Array หมายความว่าเรียงเสร็จสมบูรณ์แล้ว
        if (i == array.length) {
            return;
        }

        // 2. การสลับค่าในรอบปัจจุบัน (Inner Pass)
        // เช็คว่าตำแหน่ง j ปัจจุบัน ยังไม่เกินขอบเขตของอาเรย์ที่ยังไม่ได้เรียงใช่หรือไม่
        if (j < array.length - 1 - i) {

            // ถ้าตัวซ้ายมากกว่าตัวขวา ให้ทำการสลับที่ (จากน้อยไปมาก)
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }

            // ขยับไปเปรียบเทียบตัวถัดไปในรอบเดียวกัน (j + 1)
            bubble(array, i, j + 1);

        } else {
            // 3. เริ่มรอบใหม่ (Outer Pass)
            // เมื่อ j เดินไปจนสุดรอบแล้ว ให้เริ่มรอบใหม่โดยเพิ่มค่า i+1 และรีเซ็ตค่า j เป็น 0
            bubble(array, i + 1, 0);
        }
    }




    public static void main(String[] args) {
        int[]a= {64, 34, 25, 12, 22, 11, 90};
        bubbleSortRecursive.bubbleSort(a);
        for (int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

    }

}
