package Tree;

/**
 * Created by Jhalak on 6/19/2017.
 */
public class NodeTree<E> {
    private NodeTree left;
    private NodeTree right;
    private NodeTree parent;
    private E val;

    public NodeTree(NodeTree parent, E val) {
        this.parent = parent;
        this.val = val;
        this.left = null;
        this.right = null;
    }

    public NodeTree<E> addLeftChild(E val){
        this.left=new NodeTree(this, val);
        return this.left;
    }

    public NodeTree<E> addRightChild(E val){
        this.right=new NodeTree(this, val);
        return this.right;
    }

    public NodeTree getLeft() {
        return left;
    }

    public void setLeft(NodeTree left) {
        this.left = left;
    }

    public NodeTree getRight() {
        return right;
    }

    public void setRight(NodeTree right) {
        this.right = right;
    }

    public NodeTree getParent() {
        return parent;
    }

    public void setParent(NodeTree parent) {
        this.parent = parent;
    }

    public E getVal() {
        return val;
    }

    public void setVal(E val) {
        this.val = val;
    }
}
