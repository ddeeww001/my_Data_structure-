package Lab12;

public class binarytree_node<T> extends node {
    public binarytree_node(node parent, T value) {
        super(parent, value);
        this.get_child().add(null); // left
        this.get_child().add(null); // right
    }

    public void add_left_node(binarytree_node node) {
        this.get_child().set(0, node);
    }

    public void add_right_node(binarytree_node node) {
        this.get_child().set(1, node);
    }

    public void remove_left_node(binarytree_node node) {
        this.get_child().set(0, null);
    }

    public void remove_right_node(binarytree_node node) {
        this.get_child().set(1, null);
    }

    public binarytree_node get_left_node() {
        return (binarytree_node) this.get_child().get(0);
    }

    public binarytree_node get_right_node() {
        return (binarytree_node) this.get_child().get(1);
    }

    public void set_parent(binarytree_node node) {
        this.parent = node;
    }

    public void set_left_node(binarytree_node node) {
        if (this.equals(node))
            return;
        this.get_child().set(0, node); //parent set child left
        node.parent = this; //child node left set parent
    }

    public void set_right_node(binarytree_node node) {
        if (this.equals(node))
            return;
        this.get_child().set(1, node); //parent set child right
        node.parent = this; //child node right set parent
    }

    public boolean has_child() {
        if (this.get_left_node() == null && this.get_right_node() == null) {
            return false;
        }
        return true;
    }

    public void remove_child(node node) { //deprecated form node class
        try {
            throw new Exception("deprecated using remove_left_node, remove_right_node");
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
