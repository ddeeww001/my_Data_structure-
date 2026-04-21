//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     AdvQueue AdvQueue1 = new AdvQueue(4);
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
     System.out.println(AdvQueue1.getRear()); // 3
    }
}