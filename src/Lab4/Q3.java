package Lab4;
import java.util.Arrays;
import java.util.Random;
public class Q3 {

        public static void main(String[] args) {
            Random random = new Random();

            // กำหนดขนาดของ Array (N x N) ลองเปลี่ยนค่า size ดูนะครับ เช่น 10, 1000, 10000
            int size = 10000;

            // สร้าง 2D Array และสุ่มข้อมูลใส่แต่ละแถว
            int[][] myTable = new int[size][size];
            for (int i = 0; i < size; i++) {
                myTable[i] = random.ints(size, 10, 100).toArray();
            }

            long startTime = System.currentTimeMillis();
            int[] result = summationRow(myTable);
            long endTime = System.currentTimeMillis();

            System.out.println("Calculated row sums for " + size + "x" + size + " table.");
            System.out.println("The method took " + (endTime - startTime) + " milliseconds");
        }

        // Method คำนวณผลรวมของแต่ละแถว
        public static int[] summationRow(int[][] table) {
            int[] rowSums = new int[table.length];
            for (int i = 0; i < table.length; i++) {
                // ประยุกต์ใช้ Stream หาผลรวมของ Array 1D แต่ละเส้น (แถว)
                rowSums[i] = Arrays.stream(table[i]).sum();
            }
            return rowSums;
        }

    /*
    ลองเปลี่ยนค่าตัวแปร size ด้านบน แล้วนำเวลามากรอกตรงนี้นะครับ
    Length of the array | 10x10 | 1000x1000 | 5000x5000 | 10000x10000
    Execution time      | 0-1   | 4-6       | 14-16     | 41-47
    */

}
