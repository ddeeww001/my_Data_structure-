package Lab2;

public class BasicLinkedList{
protected MyNode head;
    public BasicLinkedList(int h){
        head = new MyNode(h);
        head.setNext(null);
    }
    public BasicLinkedList(){

    }


    public MyNode getHead() {
        return head;
    }
    public void setHead(MyNode head) {
        this.head = head;
    }

    public void  addFirst(int x){
        MyNode temp = new MyNode(x);
        temp.setNext(head);
        head = temp;
        System.out.println(head.element);
    }

    public void removeFirst(){
        MyNode current = head.getNext();
        System.out.println("[removeFirst]Remove: "+head.element);
        head = current;
    }

    public int getFirst(){
        return head.element;
    }

    public void  printAll(){
        MyNode current = head;
        while (current != null){
            System.out.print(current.element+" ");
            current = current.next;

        }
    }

    public int getSize() {
        MyNode num= head;;
        int count = 0;
        while (num != null) {
            count+=1;
            num = num.next;

        }
        System.out.println("Get size: "+count);
    return count;
    }
}
