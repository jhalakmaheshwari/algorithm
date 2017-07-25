package Tree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by Jhalak on 7/23/2017.
 */
class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
}

public class InOrderWithoutRecursion {
    public static void postorderTraversal(TreeNode a) {
        ArrayList<Integer> resList = new ArrayList<Integer>();
        Stack<TreeNode> tempStack = new Stack<TreeNode>();
        tempStack.push(a);
        while(tempStack.size() > 0){
            TreeNode popNode = tempStack.pop();
            // System.out.println(popNode.val);
            if(popNode.right != null){
                TreeNode tempNode = popNode.right;
                popNode.right=null;
                tempStack.push(popNode);
                tempStack.push(tempNode);
                continue;
            }
            else{
                resList.add(popNode.val);
                // tempStack.remove(tempStack.size() - 1);
                if(popNode.left != null){
                    tempStack.push(popNode.left);
                }
            }
        }

        for(int i=0; i< resList.size(); i++){
            System.out.println(resList.get(i));
        }

    }

    public static void main(String[] args) {
        TreeNode node = new TreeNode(1);
        node.left = new TreeNode(2);
        node.right = new TreeNode(3);
        node.right.left = new TreeNode(4);
        node.right.left.right = new TreeNode(5);
        postorderTraversal(node); 
    }
}
