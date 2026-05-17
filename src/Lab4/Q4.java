package Lab4;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
         Random random = new Random();

        // 1. กำหนดขนาดต่างๆ ที่ต้องการทดสอบ (Varying the size)
        // ทดสอบตั้งแต่ขนาดเล็กไปจนถึงขนาดที่เริ่มทำให้เครื่องคิดหนัก
        int[] testSizes = {10, 100, 500, 800};

        System.out.printf("%-25s | %-20s%n", "Matrix Size (M x N x P)", "Execution time (ms)");
        System.out.println("---------------------------------------------------------");

        for (int size : testSizes) {
            int m = size;
            int n = size;
            int p = size;

            // 2. สร้าง Matrix A และ B
            int[][] matrixA = new int[m][n];
            int[][] matrixB = new int[n][p];

            // 3. สุ่มค่าใส่เมทริกซ์ด้วยสไตล์ของคุณ (จำกัดค่า 1-10 เพื่อไม่ให้ผลลัพธ์ล้นหลักเกินไป)
            for (int i = 0; i < m; i++) {
                matrixA[i] = random.ints(n, 1, 10).toArray();
            }
            for (int i = 0; i < n; i++) {
                matrixB[i] = random.ints(p, 1, 10).toArray();
            }

            // 4. เริ่มจับเวลาเฉพาะส่วนที่คำนวณคูณเมทริกซ์ตามโจทย์สั่ง
            long startTime = System.currentTimeMillis();
            int[][] result = multiplyMatrix(matrixA, matrixB);
            long endTime = System.currentTimeMillis();

            long duration = endTime - startTime;

            // 5. พิมพ์ผลลัพธ์แสดงบนหน้าจอ
            String sizeStr = m + "x" + n + "x" + p;
            System.out.printf("%-25s | %-20d%n", sizeStr, duration);
        }
    }

    // Method สำหรับการคูณเมทริกซ์ (Triple Nested Loop)
    public static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int m = a.length;
        int n = a[0].length;
        int p = b[0].length;
        int[][] result = new int[m][p];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < p; j++) {
                for (int k = 0; k < n; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    /*
    ผลลัพธ์การทดสอบเพื่อนำไปเติมในตารางของอาจารย์:
    Matrix sizes (MxNxP) | 10x10x10 | 100x100x100 | 500x500x500 | 800x800x800
    Execution time (ms)  | 0        | 2-4         | 87-92       | 435-439

    Q5
    Questions |Big O
    allQ        | 1
    Q2        | 1
    Q3        | n
    Q4        | n^3
        */
}