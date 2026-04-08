
public class MyStack {
    private int top=-1;
    private int[] list;
    public MyStack(int size)
    {
        list = new int[size];
    }

    public int push(int x)
    {
        if(top == list.length-1){
            System.out.println("Warning: Stack is  full.");
        }else {
            top = top + 1;
            list[top] = x;
            return list[top];
        }
        return 0;
    }

    public void pop()
    {
        if(top <= -1){
            System.out.println("Warning: Stack is empty");
        }else {
            int x = list[top];
            list[top] = 0;
            top = top - 1;

        }
    }
}
