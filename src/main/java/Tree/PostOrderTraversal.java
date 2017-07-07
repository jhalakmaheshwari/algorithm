package Tree;

/**
 * Created by Jhalak on 6/20/2017.
 */
//Left Right Root
public class PostOrderTraversal<E> {
    static public void postOrder(NodeTree node){
        if(node!=null){
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.print(node.getVal()+"  ");
        }
    }
}
