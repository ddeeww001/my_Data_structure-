package Lab11;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TernaryTree extends Node{


    public TernaryTree(int value) {
        super(value);
    }

    public TernaryTree() {
        super();
    }

    public static Node add_left_to_right(int num, int nodeNum) {
        if (num <= 0) return null;

        Queue<Node> queue = new LinkedList<>();
        Node root = new Node(1);
        queue.add(root);
        int currentVal = 2;
        while (currentVal <= num) {
            Node parent = queue.peek();
            if (parent.get_child().size() >= nodeNum) {
                queue.poll();
                parent = queue.peek();
            }

            Node child = new Node(currentVal);
            parent.add_child(child);
            queue.add(child);
            currentVal++;
        }
        return root;
    }

    public static void print_tree_v2(Node node) {
        if (node == null) return;
        System.out.println("root: " + node.get_value());
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (!current.is_leaf_node()) {

                System.out.print("p:" + current.get_value() + " c: {");

                for (Node child : current.get_child()) {
                    System.out.print(child.get_value() + ", ");

                    queue.add(child);
                }
                System.out.println("}");
            }
        }
    }


    public static void print_tree(Node node) {
        if (node == null) return;

        System.out.println("root: " + node.get_value());
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.print("p:" + current.get_value() + " c: {");
            for (Node child : current.get_child()) {
                System.out.print(child.get_value() + ", ");
                queue.add(child);
            }

            System.out.println("}");
        }
    }


}