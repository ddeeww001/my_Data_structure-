package Lab2;

public class LinkedListWithThird extends BasicLinkedList {
    private MyNode current;
    public LinkedListWithThird(int h) {
        super(h);
    }
    public LinkedListWithThird() {
        super();
    }


    public int getThird(){
        if(getSize()<3){
                System.out.println("Don't have third number");
            return 0;
        }else{
            System.out.println("[getThird]");
            return head.next.next.element;
        }
    }

    public int addThird(int add){

        if(getSize()<2){
            System.out.println("[please add number]");
            return 0;
        }else {
            current=head.next;
             MyNode third = new MyNode(add);
             third.next = current.next;
             current.next = third;
             return  add;

        }
    }

    public void removeThird(){
        if(getSize()<2){
            System.out.println("[you didn't have third data]");
    }else {
            current = head.next.next.next;
            head.next.next = current;
            printAll();
        }
    }

}
