public class MyQueue {
    private int front;
    private int rear;
    private int[] list;

    public  MyQueue(int size){
        front=0;
        rear =-1;
        list = new int[size];
    }
    public void enQueue(int x){
        if(((rear++)% list.length == front% list.length)&&(front > rear)) {
            System.out.println("Warning: Queue is full");
        }
        else {
            rear ++;
            list[rear%list.length]=x;
        }
    }
    public int deQueue(){
        if(rear == -1){
            System.out.println("Warning: Queue is empty");
        }else if(front > rear){
            System.out.println("Warning: Queue is empty");
        }else {
            int temp = list[front % list.length];
            list[front] = 0;
            front++;
            return temp;
        }return 0;
    }
}
