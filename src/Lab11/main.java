package Lab11;

import java.util.List;

import static Lab11.TernaryTree.*;

public class main {
    public static void main(String[] args) {
        Node root = add_left_to_right(10, 3);

        System.out.println("----Q2-2----");
        print_tree(root);
        System.out.println("\n----Q2-3----");
        System.out.println( root.is_leaf_node() ); //false
        System.out.println( ((Node) ((Node) root.get_child().get(0)).get_child().get(0)).get_value() ); //5
        System.out.println( ((Node) ((Node) root.get_child().get(0)).get_child().get(0)).is_leaf_node() ); //true
        System.out.println("\n----Q2-4----");
        print_tree_v2(root);

        System.out.println("\n----Q2-5----");

        tree<Integer> tree1 = new tree<Integer>(root);

        ((Node) tree1.get_root().get_child().get(2)).set_value(5);
        print_tree_v2(root);
        Node node1 = tree1.dfs(root, 5); //dfs
        System.out.println( node1.get_value() ); // 5
        System.out.print( node1.get_parent().get_value() ); // 2
        System.out.println("");

        System.out.println("\n----Q2-6----");
        tree<Integer> tree2 = new tree<Integer>(root);
        ((Node)tree2.get_root().get_child().get(2)).set_value(5);
        Node nodeA = tree1.dfs(root, 5); //dfs
        Node nodeB = tree1.bfs(root, 5); //dfs
        List<Node> ListA = root.get_back_track(nodeA);
        for (Node n:ListA) {
            System.out.print(n.get_value()+"->");
        }
        System.out.println("");
        List<Node> ListB = root.get_back_track(nodeB);
        for (Node n:ListB) {
            System.out.print(n.get_value()+"->");
        }

        System.out.println("\n----Q2-7----");

    }
}
