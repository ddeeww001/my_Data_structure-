package Lab3;

import java.util.LinkedList;
import java.util.Scanner;

public class Question4 {
    public static void main(String[]args){
        LinkedList<String>student = new LinkedList<>();
        Scanner sc = new Scanner(System.in);

        while (true){
            System.out.println("Enter all student name who ordering a T-shirt: ");
            String name = sc.nextLine();
            if(name.equalsIgnoreCase("print all")){
                System.out.println(student);
            }else if(name.equalsIgnoreCase("remove")){
                System.out.println("Enter the student name who received the T-shirt: ");
                name = sc.nextLine();
                student.remove(name);
            }else {
                student.add(name);
            }
        }
    }
}
