package CodeLeet.Trees;

/**
 * Created by Jhalak on 8/14/2017.
 */
public class Problem606ConstructStringFromBinaryTree {

    public String tree2str(TreeNode t) {
        if(t == null){
            return "";
        }
        String str=tree2str1(t.left, "");
        str+=tree2str1(t.right,"");
        if(str.substring(str.length()-2).equals("()")){
            str=str.substring(0,str.length()-2);
        }
        if(str.substring(str.length()-2).equals("()")){
            str=str.substring(0,str.length()-2);
        }
        return t.val+str;
    }

    public String tree2str1(TreeNode t, String str) {
        if(t == null){
            return "()";
        }
        str+="("+t.val;
        str+=tree2str1(t.left,"");
        str+=tree2str1(t.right,"");
        if(str.substring(str.length()-2).equals("()")){
            str=str.substring(0,str.length()-2);
        }
        if(str.substring(str.length()-2).equals("()")){
            str=str.substring(0,str.length()-2);
        }
        str+=")";
        return str;
    }

}
