package Lab12;

// this lab uses previous lab9 (tree.java and node.java in lab8)
public class lab10 {
    public static void main(String[] args) {
//2.
        binarysearchtree binarysearchtree1 = new binarysearchtree();
        binarysearchtree1.add_node(5);
        binarysearchtree1.add_node(3);
        binarysearchtree1.add_node(1);
        binarysearchtree1.add_node(2);
        binarysearchtree1.add_node(7);
        binarysearchtree1.add_node(6);
        binarysearchtree1.add_node(8);
        binarysearchtree1.print_tree();

        System.out.print("------------------------------------------");
//3.
        binarytree_node node_a = binarysearchtree1.search(5);
        System.out.println(node_a.get_value());
        node_a = binarysearchtree1.search(6);
        System.out.println(node_a.get_value());
        node_a = binarysearchtree1.search(2);
        System.out.println(node_a.get_value());
        node_a = binarysearchtree1.search(8);
        System.out.println(node_a.get_value());
        node_a = binarysearchtree1.search(10);
        System.out.println(node_a);
        System.out.print("------------------------------------------");
//4.
        binarytree_node root = (binarytree_node) binarysearchtree1.get_root();
        binarytree_node node_max_left = binarysearchtree1.search_max_leftside(root);
        binarytree_node node_min_right = binarysearchtree1.search_min_rightside(root);// write this method
        System.out.println(node_max_left.get_value());
        System.out.println(node_min_right.get_value());
        binarysearchtree binarysearchtree2 = new binarysearchtree();;
        binarysearchtree2.add_node(7);
        binarysearchtree2.add_node(4);
        binarysearchtree2.add_node(8);
        binarysearchtree2.add_node(2);
        binarysearchtree2.add_node(5);
        binarysearchtree2.add_node(1);
        binarysearchtree2.add_node(3);
        binarysearchtree2.add_node(6);
        binarysearchtree2.print_tree();
        binarysearchtree2.remove_node(4);
        binarysearchtree2.print_tree();
    }
}
