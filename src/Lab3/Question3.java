package Lab3;

import java.util.Scanner;
import java.util.Stack;

public class Question3 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> myNumber =new Stack<>();
        while (true){
            System.out.print("Enter positive integer: ");
            int num = sc.nextInt();
            if(num < 0){
                System.out.println("Please enter positive integer!!");
            }else if(num > 0){
                myNumber.clear();
                while (num>0){
                    myNumber.push(num%2);
                    num = Math.abs(num/2);
                }
                System.out.println(myNumber);

            }
        }
    }
}

