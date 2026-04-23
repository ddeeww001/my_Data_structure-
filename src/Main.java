//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     /*AdvQueue AdvQueue1 = new AdvQueue(4);
     System.out.println("enQueue 1 2 3 4 5");
     AdvQueue1.enQueue(1);
     AdvQueue1.enQueue(2);
     AdvQueue1.enQueue(3);
     AdvQueue1.enQueue(4);
     AdvQueue1.enQueue(5); // insert more than queue size (overflow)
     System.out.println("AdvQueue1.getSize()");
     System.out.println(AdvQueue1.getSize()); // 4
     System.out.println("AdvQueue1.deQueue()");
     System.out.println(AdvQueue1.deQueue()); // 1
     System.out.println("AdvQueue1.getFront()");
     System.out.println(AdvQueue1.getFront()); // 2
     System.out.println("AdvQueue1.search 0 1 3");
     System.out.println(AdvQueue1.search(0)); // false
     System.out.println(AdvQueue1.search(1)); // false
     System.out.println(AdvQueue1.search(3)); // true
     System.out.println("AdvQueue1.getSize()");
     System.out.println(AdvQueue1.getSize()); // 3
     System.out.println("clear");
     AdvQueue1.clear();
     System.out.println("AdvQueue1.search 0 1 3");
     System.out.println(AdvQueue1.search(0)); // false
     System.out.println(AdvQueue1.search(1)); // false
     System.out.println(AdvQueue1.search(3)); // false
     System.out.println("AdvQueue1.getSize()");
     System.out.println(AdvQueue1.getSize()); // 0
     System.out.println("enQueue 1 2 3");
     AdvQueue1.enQueue(1);
     AdvQueue1.enQueue(2);
     AdvQueue1.enQueue(3);
     System.out.println("AdvQueue1.getSize()");
     System.out.println(AdvQueue1.getSize()); // 3
     System.out.println("AdvQueue1.getRear()");
     System.out.println(AdvQueue1.getRear()); // 3*/


     AdvStack AdvStack1 = new AdvStack(4);
     System.out.println("push 1 2 3");
     AdvStack1.push(1);
     AdvStack1.push(2);
     AdvStack1.push(3);
     System.out.print("pop: ");
     System.out.println(AdvStack1.pop()); //3
     System.out.print("pop: ");
     System.out.println(AdvStack1.pop()); //2
     System.out.print("pop: ");
     System.out.println(AdvStack1.pop()); //1
     System.out.print("pop: ");
     System.out.println(AdvStack1.pop()); //underflow
     System.out.print("pop: ");
     System.out.println(AdvStack1.pop()); //underflow
     System.out.println("push 1 2 3");
     AdvStack1.push(1);
     AdvStack1.push(2);
     AdvStack1.push(3);
     System.out.println("double push 3 4 * cant do");
     AdvStack1.doublePush(3,4); // depend on your algorithm whether you allow topush one or none.
     System.out.println("double pop");
     AdvStack1.doublePop();
     System.out.println("doublePush(7,8)");
     AdvStack1.doublePush(7,8); //
     System.out.println("double pop");
     AdvStack1.doublePop(); //8 7
     System.out.println("double pop");
     AdvStack1.doublePop();
     System.out.println(AdvStack1.pop());
    }
}