package QS;

public class MyQueue {
    protected int front;
    protected int rear;
    protected int[] list;

    public  MyQueue(int size){
        front=0;
        rear =-1;
        list = new int[size];
    }

    public void enQueue(int x){

        if((rear+1) - front >= list.length) {
            System.out.println("Warning: Queue is full");
        }
        else {
            rear ++;
            list[rear%list.length]=x;
            System.out.println("enQueue: "+x);
        }
    }
    public int deQueue(){
        if((front > rear)&&(rear!= -1)){
            System.out.println("Warning: Queue is empty");
        }else {
            int temp = list[front % list.length];
            list[front] = 0;
            front++;
           //System.out.println("deQueue: "+temp +" Front: "+front);
            return temp;
        }return 0;
    }

    public int getFront() {
        return list[front];
    }

    public void setFront(int front) {
        this.front = front;
    }

    public int getRear() {
        return list[rear];
    }

    public void setRear(int rear) {
        this.rear = rear;
    }

    public int[] getList() {
        return list;
    }

    public void setList(int[] list) {
        this.list = list;
    }
}
