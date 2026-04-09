import java.util.Arrays;

public class AdvQueue extends MyQueue{
    public AdvQueue(int size) {
        super(size);
    }


    public String search(double number){
        if ((!(number instanceof int ))||(!(Arrays.stream(getList()).anyMatch(x -> x == number)))){
            System.out.println("FALSE");
            return "FALSE";
        }else {
            System.out.println("TRUE");
            return "TRUE";
        }
    }

    public void clear(){
        int[] l = getList();
        Arrays.fill(l,0);//คำสั่งให้ทุกข้อมูลเปลี่ยนเป็น 0 ใน Array โดยไม่ลบ length
        setList(l);
        System.out.println("Clear");
    }

    public int getSize(){
        System.out.println("Size: "+getList().length);
        return getList().length;
    }

    public void isFull(){
        if(getSize() == getList().length){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }
    }


    public int getFronts(){
        int[] list = getList();
        int temp = getFront();
        temp = list[temp];
        System.out.println("Front number: "+temp);
        return temp;
    }
    public int getRears(){
        int[] list = getList();
        int temp = getRear();
        temp = list[temp];
        System.out.println("Rear number: "+temp);
        return temp;
    }
}
