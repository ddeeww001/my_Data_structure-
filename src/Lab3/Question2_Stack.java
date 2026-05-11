package Lab3;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Question2_Stack {
    public static void main(String[] args) {
        java.util.Stack<Integer> mystack =new java.util.Stack<>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of times: ");
        int round = sc.nextInt();
        int num;
        for (int i = 0;i<round;i++){
            System.out.print("Input number ["+(i+1)+"]: ");
            num = sc.nextInt();
            mystack.push(num);
        }
        while (!(mystack.empty())){
            System.out.print(mystack.pop()+" ");
        }

    }
}