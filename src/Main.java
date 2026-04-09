//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       MyQueue qq = new MyQueue(3);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.enQueue(1);
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();
        qq.deQueue();

        /*
        AdvStack ss = new AdvStack(3);
        ss.pop();
        ss.pop();
        System.out.println(ss.push(1));
        System.out.println(ss.push(1));
        System.out.println(ss.push(2));
        System.out.println(ss.push(3));
        System.out.println(ss.peak());
        ss.doublePop();
        ss.search(-1);
        ss.clear();
        ss.doublePop();
        ss.doublePop();
        ss.doublePush(1,2);
        */
    }
}