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
}
