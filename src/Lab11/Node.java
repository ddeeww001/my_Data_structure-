package Lab11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node {
    int value;// เปลี่ยนจาก element เป็น value
    Node parent;
    ArrayList<Node> childNode = new ArrayList<>();

    public Node(int value) {
        this.value = value;
    }
    public Node() {
    }

    public void add_child(Node child){
        child.parent = this;
        childNode.add(child);
    }

    public ArrayList<Node> get_child(){
        return childNode;
    }


    public int get_value() {
        return value;
    }

    public void set_value(int value) {
        this.value = value;
    }

    public boolean is_leaf_node() {
        return childNode.isEmpty();
    }

    public boolean has_child() {
        return !childNode.isEmpty();
    }

    public Node get_parent() {
        return parent;
    }

    public List<Node> get_back_track(Node node1) {
        List<Node> path = new ArrayList<>();
        Node current = node1;
        while (current != null) {
            path.add(current);
            current = current.get_parent();
        }
        return path;
    }



    public List<Node> get_reverse_back_track(Node node1) {
        List<Node> path = get_back_track(node1);
        Collections.reverse(path);
        return path;
    }





}