package Lab6;
import java.util.Scanner;

public class AssignmentQ8 {

    public static void printPairs(int[] arr, int i, int j) {
        if (i >= arr.length) {
            return;
        }
        if (j >= arr.length) {
            printPairs(arr, i + 1, i + 2);
            return;
        }
        System.out.print("{" + arr[i] + "," + arr[j] + "} ");
        printPairs(arr, i, j + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the input: ");
        int length = scanner.nextInt();

        int[] input = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter: " + (i + 1) + " integer: ");
            input[i] = scanner.nextInt();
        }

        System.out.print("Output will be: ");
        printPairs(input, 0, 1);
        System.out.println();

        scanner.close();
    }/*
Enter the length of the input: 3
Enter #1 integer: 3
Enter #2 integer: 2
Enter #3 integer: 1
Output will be: {3,2} {3,1} {2,1}
*/
}