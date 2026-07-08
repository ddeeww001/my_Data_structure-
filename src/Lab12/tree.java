package Lab12;

import java.util.LinkedList;
import java.util.Queue;
public class tree<T> {
    protected node root;
    public tree(node root)
    {
        this.root = root;
    }
    public node get_root(){
        return this.root;
    }
    //print tree
    public void print_tree(node node)
    {
        Queue<node> queue = new LinkedList<node>();
        queue.add(node);
        System.out.println("root: "+node.get_value());
        while(!queue.isEmpty())
        {
            node node1 = queue.poll();
            System.out.print("p:"+node1.get_value()+" c: {");
            for (Object child_node : node1.get_child()) {
                System.out.print(((node)child_node).get_value()+", ");
                queue.add((node)child_node);
            }
            System.out.println("}");
        }
    }
    //print tree v2
    public void print_tree_v2(node node)
    {
        Queue<node> queue = new LinkedList<node>();
        queue.add(node);
        System.out.println("root: "+node.get_value());
        while(!queue.isEmpty())
        {
            node node1 = queue.poll();
            if(!node1.is_leaf_node())
                System.out.print("p:"+node1.get_value()+" c: {");
            int index = 0;
            for (Object child_node : node1.get_child()) {
                if(child_node != null)
                {
                    System.out.print(((node)child_node).get_value()+"("+index+") , ");
                    queue.add((node)child_node);
                }
                index = index + 1;
            }
            if(!node1.is_leaf_node())
                System.out.println("}");
        }
    }
    private node _node;
    public void dfs2(node node, T x)
    {
        if(node.get_value() == x)
        {
            this._node = node;
            return;
        }
        for (Object o1 : node.get_child()) {
            if(this._node != null)
                return;
            dfs2(((node)o1), x);
        }
    }
    public node bfs2(node node, T x)
    {
        Queue<node> Queue1 = new LinkedList<>();
        Queue1.add(node);
        while(! Queue1.isEmpty())
        {
            node n1 = Queue1.poll();
            if(n1.get_value() == x)
                return n1;
            for (Object o1 : n1.get_child()) {
                Queue1.add((node)o1);
            }
        }
        return null;
    }
    //write depth-first search
    private node _node_found;
    public node dfs(node node, T value)
    {
        this._node_found = null;
        recur_dfs(node, value);
        return this._node_found;
    }
    private boolean recur_dfs(node node, T value){
// System.out.println("---"+node.get_value());
// check equal
        if(node.get_value() == value)
        {
// System.out.println("found");
            this._node_found = node;
            return true;
        }
// recursive child nodes
        for (Object child_node : node.get_child()) {
            node child = (node)child_node;
            if(this._node_found == null)
                recur_dfs(child, value);
        }
        return false;
    }
    //write breadth first search
    public node bfs(node node, T value){
        Queue<node> queue = new LinkedList<node>();
        queue.add(node);
        while(!queue.isEmpty())
        {
            node n1 = queue.poll();
// check equal
            if(n1.get_value() == value)
            {
                return n1;
            }
            for (Object child_node : n1.get_child()) {
                queue.add((node)child_node);
            }
        }
        return null;
    }
}
