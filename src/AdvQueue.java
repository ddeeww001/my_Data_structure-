import java.util.Arrays;

public class AdvQueue extends MyQueue{
    public AdvQueue(int size) {
        super(size);
    }


    public void search(double number){
        if ((!(number instanceof int))||((!Arrays.stream(getList()).anyMatch(x -> x == number)))){
            System.out.println("FALSE");
        }else {
            System.out.println("TRUE");
        }
    }

    public void clear(){
        int[] l = getList();
        Arrays.fill(l,0);//คำสั่งให้ทุกข้อมูลเปลี่ยนเป็น 0 ใน Array โดยไม่ลบ length
        setList(l);
        System.out.println("Clear");
    }

    public void doublePop(){
        System.out.println("doublePop");
        deQueue();
        deQueue();
    }

    public void doublePush(int x, int y){
        enQueue(x);
        enQueue(y);
        System.out.println("doublePush: "+x+","+y);
    }
}
