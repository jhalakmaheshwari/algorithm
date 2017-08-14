package CodeLeet.Trees;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.*;
/**
 * Created by Jhalak on 8/14/2017.
 */
public class Problem637AvgLevelsOfTreeNodes {


    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> result = new ArrayList<Double>();
        HashSet<TreeNode> S = new HashSet<TreeNode>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        result.add((double)root.val);
        S.add(root);
        queue.add(root);

        int n=0;
        int counter = 0;
        double sum = 0.0;
        double m=0.0;
        while(queue.size() > 0){
            counter++;
            TreeNode current = queue.poll();
            System.out.println(current.val);
            if(Math.pow(2,n) < counter){
                n++;
                result.add(sum/m);
                m=0.0;
                sum=0.0;
                counter=0;
                sum=sum+current.val;
                m++;
                counter++;
            }
            else{
                sum=sum+current.val;
                m++;
            }
            if(current.left != null)
                queue.add(current.left);
            if(current.right != null)
                queue.add(current.right);
        }
        if(sum > 0){
            result.add(sum/m);
        }
        return result;

    }

    public static void main(String[] args) {
        TreeNode tn =new TreeNode(3);
        tn.left = new TreeNode(9);
        tn.right = new TreeNode(20);
        tn.right.left = new TreeNode(15);
        tn.right.right = new TreeNode(7);
        Problem637AvgLevelsOfTreeNodes pl = new Problem637AvgLevelsOfTreeNodes();
        pl.averageOfLevels(tn);
    }
}
