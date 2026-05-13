package Lab2;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("=== BasicLinkedList ===");
        BasicLinkedList basic = new BasicLinkedList();
        basic.addFirst(30);
        basic.addFirst(20);
        basic.addFirst(10);
        basic.printAll(); // 10 -> 20 -> 30
        System.out.println();

        System.out.println("First: " + basic.getFirst()); // 10
        System.out.println("Size: " + basic.getSize()); // 3
        basic.removeFirst();
        basic.printAll(); // 20 -> 30
        System.out.println();

        System.out.println("\n=== EnhancedLinkedList ===");
        EnhancedLinkedList enhanced = new EnhancedLinkedList();
        enhanced.addFirst(30);
        enhanced.addFirst(20);
        enhanced.addFirst(10);
        enhanced.printAll(); // 10 -> 20 -> 30
        System.out.println();

        enhanced.addLast(40);
        enhanced.printAll(); // 10 -> 20 -> 30 -> 40
        System.out.println();

        System.out.println("Last: " + enhanced.getLast()); // 40
        enhanced.addLast(50);
        enhanced.printAll(); // 10 -> 20 -> 30 -> 40 -> 50
        System.out.println();

        System.out.println("Last: " + enhanced.getLast());
        enhanced.removeLast();
        System.out.println();

        enhanced.printAll(); // 10 -> 20 -> 30 -> 40
        enhanced.removeLast();
        System.out.println();

        enhanced.printAll(); // 10 -> 20 -> 30
        System.out.println();

        System.out.println(enhanced.search(20)); // TRUE
        System.out.println(enhanced.search(99)); // FALSE
        enhanced.remove(20);
        enhanced.printAll(); // 10 -> 30
        System.out.println();

        System.out.println(enhanced.search(20)); // FALSE
        System.out.println("\n=== LinkedListWithThird ===");
        LinkedListWithThird third = new LinkedListWithThird();
        third.addFirst(40);
        third.addFirst(30);
        third.addFirst(20);
        third.addFirst(10);
        third.printAll(); // 10 -> 20 -> 30 -> 40
        System.out.println();

        System.out.println("Third: " + third.getThird()); // 30
        third.addThird(99);
        third.printAll(); // 10 -> 20 -> 99 -> 30 -> 40
        System.out.println();

        third.addThird(88);
        third.printAll(); // 10 -> 20 -> 88 -> 99 -> 30 -> 40
        System.out.println();

        third.removeThird();
        third.removeThird();
        third.printAll(); // 10 -> 20 -> 30 -> 40

    }
}