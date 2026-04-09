import java.util.Arrays;

public class AdvStack extends MyStack {
    public AdvStack(int size) {
        super(size);
    }

    public int peak(){
        int[] list = getList();
        int top = getTop();
        System.out.println("The top value: ");
        return list[top];
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
        pop();
        pop();
    }

    public void doublePush(int x, int y){
        push(x);
        push(y);
        System.out.println("doublePush: "+x+","+y);
    }

}
