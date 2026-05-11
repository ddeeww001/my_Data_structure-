package LinkList;

public class MyNode {
    protected int element;
    protected MyNode next;
    public MyNode(int x) {
        this.element = x;
    }
    public MyNode() {
    }


    public MyNode(MyNode x) {
        this.next = x;
    }


    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public MyNode getNext() {
        return next;
    }

    public void setNext(MyNode next) {
        this.next = next;
    }
}
