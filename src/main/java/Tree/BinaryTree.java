package Tree;

/**
 * Created by Jhalak on 6/19/2017.
 */
public class BinaryTree<E> {

    public static void main(String[] args) {
        NodeTree node=new NodeTree(null, 16);
        node.addLeftChild(14);
        node.addRightChild(18);
        node.getLeft().addLeftChild(12);
        node.getLeft().addRightChild(15);
        node.getRight().addLeftChild(17);
        node.getRight().addRightChild(19);
        System.out.println("   "+node.getVal()+"   ");
        System.out.println("/  \\");
        System.out.println(node.getLeft().getVal() + "    " + node.getRight().getVal());
        System.out.println("/  \\     "+ "/  \\");
        System.out.println(node.getLeft().getLeft().getVal()+"    "+node.getLeft().getRight().getVal()+"    "+node.getRight().getLeft().getVal()+"    "+node.getRight().getRight().getVal());


    }


}
