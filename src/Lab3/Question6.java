package Lab3;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Question6 {
    // ฟังก์ชันช่วยเช็คว่าเป็นเครื่องหมายหรือไม่
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%");
    }

    // ฟังก์ชันคำนวณพื้นฐาน
    private static int applyOp(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/": return a / b;
            case "%": return a % b;
            default: return 0;
        }
    }

    // 1. Function สำหรับคำนวณ Postfix
    public static int evaluatePostfix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            if (!isOperator(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int val2 = stack.pop();
                int val1 = stack.pop();
                stack.push(applyOp(val1, val2, token));
            }
        }
        return stack.pop();
    }

    // 2. Function สำหรับคำนวณ Prefix
    public static int evaluatePrefix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        // อ่านจากขวาไปซ้าย
        for (int i = tokens.length - 1; i >= 0; i--) {
            String token = tokens[i];
            if (!isOperator(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();
                stack.push(applyOp(val1, val2, token));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression (space separated):");
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");

        if (tokens.length == 0) return;

        // เช็คว่าเป็น Prefix หรือ Postfix
        if (isOperator(tokens[0])) {
            System.out.println("Detected: Prefix Expression");
            int result = evaluatePrefix(tokens);
            System.out.println("Result = " + result);
        } else if (isOperator(tokens[tokens.length - 1])) {
            System.out.println("Detected: Postfix Expression");
            int result = evaluatePostfix(tokens);
            System.out.println("Result = " + result);
        } else {
            System.out.println("Invalid format or Infix not supported.");
        }


    }
}

