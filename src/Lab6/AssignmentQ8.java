package Lab6;

import java.util.Scanner;

public class AssignmentQ8 {

    /**
     * ฟังก์ชัน Recursion สำหรับพิมพ์คู่เอาต์พุต
     * @param arr อาเรย์ข้อมูล
     * @param i ดัชนีตัวตั้งหลัก (เปรียบเหมือนลูปนอก)
     * @param j ดัชนีตัวที่นำมาจับคู่ (เปรียบเหมือนลูบใน)
     */
    public static void printPairs(int[] arr, int i, int j) {
        // Base Case 1: หากตัวตั้งหลักวิ่งจนสุดอาเรย์แล้ว -> จบการทำงาน
        if (i >= arr.length) {
            return;
        }

        // Base Case 2: หากตัวจับคู่ j วิ่งไปจนสุดอาเรย์ -> ให้ขยับตัวตั้งหลัก i ไปตัวถัดไป
        // และให้ j เริ่มต้นที่ตำแหน่ง i + 1 เสมอเพื่อไม่ให้ซ้ำคู่เดิม
        if (j >= arr.length) {
            printPairs(arr, i + 1, i + 2);
            return;
        }

        // พิมพ์ผลลัพธ์จับคู่ในปัจจุบัน
        System.out.print("{" + arr[i] + "," + arr[j] + "} ");

        // ขยับตัวจับคู่ j ไปตัวถัดไป (ขยับลูปใน)
        printPairs(arr, i, j + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the input: ");
        int length = scanner.nextInt();

        int[] input = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter #" + (i + 1) + " integer: ");
            input[i] = scanner.nextInt();
        }

        System.out.print("Output will be: ");
        // เรียกใช้ฟังก์ชัน เริ่มต้นคู่แรกที่ index i=0 และ j=1
        printPairs(input, 0, 1);
        System.out.println(); // ขึ้นบรรทัดใหม่เมื่อเสร็จสิ้น

        scanner.close();
    }
}