//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      /*  MyQueue qq = new MyQueue(5);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
       */
        MyStack ss = new MyStack(3);
        ss.pop();
        ss.pop();
        System.out.println(ss.push(1));
        System.out.println(ss.push(1));
        System.out.println(ss.push(1));
        System.out.println(ss.push(1));
        System.out.println(ss.push(1));
    }
}