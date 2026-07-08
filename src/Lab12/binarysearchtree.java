package Lab12;

public class binarysearchtree extends tree{
    public binarysearchtree() {
//notice bt_node extend from node can insert to parent class
//actually, interface is better than extension instance
        super(null);
    }
    public void print_tree(){
        this.print_tree_v2(get_root());
    }
    //q1
    public void add_node(int value) {
//root null (add root node)
        if(this.get_root() == null)
        {
            binarytree_node bt_node1 = new binarytree_node(null, value);
            this.root = bt_node1;
            return;
        }
        binarytree_node bt_node1 = (binarytree_node) this.get_root();
        while (true)
        {
            if(bt_node1 == null || value == (int)bt_node1.get_value())
            {
                return;
            }
            if(value < (int)bt_node1.get_value())
            {
//left
                if(bt_node1.get_left_node() == null)
                {
                    binarytree_node bt_node2 = new binarytree_node(bt_node1, value);
                    bt_node1.add_left_node(bt_node2);
                    return;
                }
                bt_node1 = bt_node1.get_left_node();
            }else
            {
//right
                if(bt_node1.get_right_node() == null)
                {
                    binarytree_node bt_node2 = new binarytree_node(bt_node1, value);
                    bt_node1.add_right_node(bt_node2);
                    return;
                }
                bt_node1 = bt_node1.get_right_node();
            }
        }
    }
    //q2
    public binarytree_node search(int x)
    {
        binarytree_node node = (binarytree_node) this.get_root();
        while(!node.is_leaf_node())
        {
            if((int)node.get_value() == x)
            {
                return node;
            }
            if((int)node.get_value() > x)
            {
//go left
                if(node.get_left_node() == null)
                    return null;
                node = node.get_left_node();
            }else{
//go right
                if(node.get_right_node() == null)
                    return null;
                node = node.get_right_node();
            }
        }
        if((int)node.get_value() == x)
        {
            return node;
        }
        return null;
    }
    //q3
    public binarytree_node search_max_leftside( binarytree_node node){
        if(node.get_left_node() == null)
        {
            return null; //no left hand side
        }
        node = node.get_left_node();
        while(node.get_right_node() != null)
        {
            node = node.get_right_node();
        }
        return node;
    }
    public binarytree_node search_min_rightside( binarytree_node node){
return node;
    }
    public void remove_node(int x){ //x = 4 delete
        binarytree_node node_x = search(x); // node 4
        if(node_x == null) // not found
            return;
        if( node_x.get_left_node() == null || node_x.get_right_node() == null)
        {
//1 child
            binarytree_node node_x_parent = (binarytree_node) node_x.get_parent();
            if(node_x_parent == null) //delete root node
            {
                if(node_x.get_left_node() != null)
                {
                    this.root = node_x.get_left_node();
                }else
                {
                    this.root = node_x.get_right_node();
                }
            }else
            {
                if((int)node_x_parent.get_value() > (int)node_x.get_value()) //node_x on left of parent
                {
                    if(node_x.get_left_node() != null)
                    {
                        node_x_parent.set_left_node(node_x.get_left_node());
                    }else
                    {
                        node_x_parent.set_left_node(node_x.get_right_node());
                    }
                }else //node_x on right of parent
                {
                    if(node_x.get_left_node() != null)
                    {
                        node_x_parent.set_right_node(node_x.get_left_node());
                    }else
                    {
                        node_x_parent.set_right_node(node_x.get_right_node());
                    }
                }
            }
        }else
        {
//2 child
            binarytree_node node_x_parent = (binarytree_node) node_x.get_parent(); //parent node x
            binarytree_node node_xl = node_x.get_left_node(); //node x left
            binarytree_node node_xr = node_x.get_right_node(); //node x right
            binarytree_node node_swap = search_min_rightside(node_x); //node swap
            binarytree_node node_swap_parent = (binarytree_node) node_swap.get_parent(); //parent node swap
            if(node_swap.is_leaf_node())
            {
// case A
//1. swap
                node_swap.set_left_node(node_xl);
                node_swap.set_right_node(node_xr);
                node_swap_parent.set_left_node(null);
                if(node_x_parent == null)
                {
                    this.root = node_swap;
                    node_swap.set_parent(null); //set to roots
                }else
                {
                    if((int)node_x_parent.get_value() > (int)node_x.get_value()) //node_x on left of parent
                    {
                        node_x_parent.set_left_node(node_swap);
                    }else
                    {
                        node_x_parent.set_right_node(node_swap);
                    }
                }
            }else
            {
                System.out.println("case b");
// case B
                System.out.println(node_swap.get_value());
                binarytree_node node_swap_r = node_swap.get_right_node();
//1. swap
                node_swap.set_left_node(node_xl);
                node_swap.set_right_node(node_xr);
                if(node_x_parent == null)
                {
                    this.root = node_swap;
                    node_swap.set_parent(null); //set to roots
                }else
                {
                    if((int)node_x_parent.get_value() > (int)node_x.get_value()) //node_x on left of parent
                    {
                        node_x_parent.set_left_node(node_swap);
                        node_swap.set_parent(node_x_parent);
                    }else
                    {
                        node_x_parent.set_right_node(node_swap);
                        node_swap.set_parent(node_x_parent);
                    }
                }
//2.replace leaf node to swap node
                node_swap_parent.set_left_node(node_swap_r);
            }
        }
    }
}