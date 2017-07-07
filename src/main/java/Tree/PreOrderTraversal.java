package Tree;

/**
 * Created by Jhalak on 6/19/2017.
 */
// Root Left Right
public class PreOrderTraversal<E> {
    static public void preOrder(NodeTree node){
        if(node!=null){
            System.out.print(node.getVal()+"  ");
            preOrder(node.getLeft());
            preOrder(node.getRight());

//            return (E) node.getVal();
        }
    }
}
