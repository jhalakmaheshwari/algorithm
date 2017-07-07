package Tree;

/**
 * Created by Jhalak on 6/20/2017.
 */
//Left Root Right
public class InOrderTraversal {
    static public void inOrder(NodeTree node){
        if(node!=null){
            inOrder(node.getLeft());
            System.out.print(node.getVal()+"  ");
            inOrder(node.getRight());
        }
    }
}
