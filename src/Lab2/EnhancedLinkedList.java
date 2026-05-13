package Lab2;

public class EnhancedLinkedList extends BasicLinkedList {
    private MyNode current;
    public EnhancedLinkedList(int h) {
        super(h);
    }
    public EnhancedLinkedList() {
        super();
    }
    public  int addLast(int x){
        current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = new MyNode(x);
        return x;
    }

    public int getLast(){
        current = head;
        while (current.next != null){
            current = current.next;
        }
        System.out.print("[getLast]->");
        return current.element ;
    }

    public void removeLast(){
        current = head;
        if(head.next == null){
            System.out.println("[Pleas add number]");
        }else {
            while (current.next.next != null){
                current = current.next;
            }
        }current.next = null;
    }

    public String search(double temp){
        current = head;
        //if(!(temp instanceof int))return "FALSE";//เชคว่าเป็น int ไหม
        while(current != null){
            if (current.element == temp)return "TRUE";
            current = current.next;
        }
        return "FALSE";
    }


    public void remove(int temp){
        System.out.println("");
        if((search(temp)) == "FALSE") System.out.println("Don't have this element");

        else {
            if(head == null)return;//แบบที่มี node แค่อันเดียว
            if(head.element == temp) {//กรณีที่มีแบบ 2 อัน
                head = head.next;
            }else {
                current = head;
                MyNode temp2  = null;
                while ((current != null) && (current.element != temp)) {//แบบปกติ
                    temp2 = current;
                    current = current.next;
                }
                if (!(current == null)) {
                    temp2.next = current.next; // กรณีที่เป็นอันสุดท้าย
                }
            }
        }

    }




}
