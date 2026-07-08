package Lab12;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class node <T>{
    private T value;
    protected node parent;
    private List<node> List_child;
    public node(node parent, T value){
        this.List_child = new LinkedList<node>();
        this.parent = parent;
        this.value = value;
    }
    public T get_value()
    {
        return this.value;
    }
    public void set_value(T value)
    {
        this.value = value;
    }
    public node get_parent()
    {
        return this.parent;
    }
    public void add_child(node node){
        this.List_child.add(node);
    }
    public void remove_child(node node) {
        this.List_child.remove(node);
    }
    public List<node> get_child()
    {
        return this.List_child;
    }
    public boolean has_child()
    {
        if(this.List_child.size()>0)
        {
            return true;
        }
        return false;
    }
    //write this method
    public boolean is_leaf_node()
    {
        if(has_child())
        {
            return false;
        }
        return true;
    }
    //please fixe this method. note: don't use try catch
    public List<node> get_sibling()
    {
//please fixed this method
        if(this.parent != null)
        {
            return this.parent.get_child();
        }
        return null;
    }
    //return list of all node from leaf to root nodes.
    public List<node> get_back_track(node node1)
    {
        List<node> result_nodes = new LinkedList<node>();
        result_nodes.add(node1);
        while(node1.get_parent() != null)
        {
            result_nodes.add(node1.get_parent());
            node1 = node1.get_parent();
        }
        return result_nodes;
    }
    //from the get_back_track_node we want to reverse items that add in the list.
//create method to return the reverse list
    public List<node> get_reverse_back_track(node leaf_node)
    {
        Stack<node> Stack_node = new Stack<node>();
        List<node> result_nodes = this.get_back_track(leaf_node);
        for (int i = 0; i < result_nodes.size(); i++) {
            Stack_node.push(leaf_node);
        }
        result_nodes = new LinkedList<node>();
        while(!Stack_node.isEmpty())
        {
            result_nodes.add(Stack_node.pop());
        }
        return result_nodes;
    }
}