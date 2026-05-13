package Lab3;

import java.util.Scanner;
import java.util.Stack;

public class Question6 {

    // เช็คว่าเป็นเครื่องหมายหรือไม่
    private static boolean isOperator(String s) {
        return s.equals("+") || s.equals("-") || s.equals("*") || s.equals("/") || s.equals("%");
    }

    // กำหนดลำดับความสำคัญ (ยิ่งสูงยิ่งทำก่อน)
    private static int precedence(String op) {
        if (op.equals("+") || op.equals("-")) return 1;
        if (op.equals("*") || op.equals("/") || op.equals("%")) return 2;
        return 0;
    }

    // ฟังก์ชันคำนวณพื้นฐาน
    private static int applyOp(int a, int b, String op) {
        switch (op) {
            case "+": return a + b;
            case "-": return a - b;
            case "*": return a * b;
            case "/":
                if (b == 0) throw new ArithmeticException("Cannot divide by zero");
                return a / b;
            case "%": return a % b;
            default: return 0;
        }
    }

    // 1. Evaluate Postfix
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

    // 2. Evaluate Prefix
    public static int evaluatePrefix(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
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

    // 3. Evaluate Infix (เพิ่มใหม่)
    public static int evaluateInfix(String[] tokens) {
        Stack<Integer> values = new Stack<>();
        Stack<String> ops = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];

            if (token.equals("(")) {
                ops.push(token);
            }
            else if (token.equals(")")) {
                while (!ops.peek().equals("(")) {
                    values.push(applyOp(values.pop(), values.pop(), ops.pop()));
                }
                ops.pop(); // เอา "(" ออก
            }
            else if (!isOperator(token)) {
                values.push(Integer.parseInt(token));
            }
            else {
                // ขณะที่เครื่องหมายบน Stack มีความสำคัญมากกว่าหรือเท่ากับตัวปัจจุบัน ให้คำนวณก่อน
                while (!ops.isEmpty() && precedence(ops.peek()) >= precedence(token)) {
                    int val2 = values.pop();
                    int val1 = values.pop();
                    String op = ops.pop();
                    values.push(applyOp(val1, val2, op));
                }
                ops.push(token);
            }
        }

        // คำนวณส่วนที่เหลือใน Stack
        while (!ops.isEmpty()) {
            int val2 = values.pop();
            int val1 = values.pop();
            String op = ops.pop();
            values.push(applyOp(val1, val2, op));
        }
        return values.pop();
    }

    public static void main(String[] args) {
        while (true){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter expression (space separated, e.g., '3 + 4 * 2' or '( 1 + 2 ) * 3'):");
        String input = sc.nextLine();
        String[] tokens = input.split("\\s+");

        if (tokens.length == 0) return;

        try {
            if (isOperator(tokens[0])) {
                System.out.println("Detected: Prefix Expression");
                System.out.println("Result = " + evaluatePrefix(tokens));
            } else if (isOperator(tokens[tokens.length - 1])) {
                System.out.println("Detected: Postfix Expression");
                System.out.println("Result = " + evaluatePostfix(tokens));
            } else {
                System.out.println("Detected: Infix Expression");
                System.out.println("Result = " + evaluateInfix(tokens));
            }
        } catch (Exception e) {
            System.out.println("Error: Invalid expression format.");
        }
    }
    }

}