package Lab3;

import java.util.LinkedList;
import java.util.Scanner;

public class Question1_Queue {
    public static void main(String[] args) {
        java.util.Queue<Character> myQ = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String input;
        int del = 0;

        while (true){
            System.out.println("Message :");
            input = sc.nextLine();
            for (int i=0; i<input.length();i++){
                if (input.charAt(i)==' '){
                    continue;
                }
                if(!(input.charAt(i)=='*')){
                    myQ.add(input.charAt(i));
                }
                if(input.charAt(i)=='*')del++;

            }

            for (int i=0;i<del;i++){
                if(myQ.isEmpty())break;
                else myQ.remove();
            }
            //System.out.println(del);
            del = 0;
            if(!(myQ.isEmpty()))System.out.println("Out");
            if(myQ.isEmpty())System.out.println("Nothing");
            myQ.removeAll(myQ);
        }

    }

}