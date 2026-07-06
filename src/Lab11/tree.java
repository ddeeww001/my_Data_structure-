package Lab11;

import java.util.LinkedList;
import java.util.Queue;

public class tree<T> extends  TernaryTree{
    private Node root;
    private Node _node_found;

    public tree(Node root) {
        super();
        this.root = root;
    }


    public Node get_root(){
        return this.root;
    }

    public void set_root(Node root){
        this.root = root;
    }

    public Node dfs(Node node, int value) {
        this._node_found = null;
        recur_dfs(node, value);
        return this._node_found;
    }

    private boolean recur_dfs(Node current, int value) {
        if (current == null) return false;

        if (current.get_value() == value) {
            this._node_found = current;
            return true;
        }

        if (current.has_child()) {
            // ดึงลูกออกมาเป็น Node ตรงๆ โดยไม่ต้องผ่าน Object เพื่อความกระชับและถูกต้อง
            for (Object child : current.get_child()) {
                if (recur_dfs((Node) child, value)) {
                    return true;
                }
            }
        }
        return false;
    }

    public Node bfs(Node startNode, int value) {
        if (startNode == null) return null;

        Queue<Node> queue = new LinkedList<>();
        queue.add(startNode);

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            if (current.get_value() == value) {
                return current;
            }

            if (current.has_child()) {
                // ดึงลูกออกมาเป็น Node ตรงๆ แล้วใส่เข้า Queue
                for (Object child : current.get_child()) {
                    queue.add((Node) child);
                }
            }
        }
        return null;
    }
}