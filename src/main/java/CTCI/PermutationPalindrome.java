package CTCI;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jhalak on 5/21/2017.
 */
public class PermutationPalindrome {

    public boolean findEvenDigits(String s1){
        String s=s1.replaceAll(" ", "");
        HashMap<String, Integer> hm=new HashMap<String, Integer>();
        char c[]=s.toCharArray();
        for(char ch: c){
            String str=""+ch;
            if(hm.containsKey(str)){
                hm.put(str,hm.get(str)+1);
            }
            else
                hm.put(str,1);
        }

        int count=0;
        for (Map.Entry<String, Integer> entry : hm.entrySet()) {
            if (entry.getValue() % 2 != 0) {
                count++;
            }

        }
        if(count<=1){
            return true;
        }

        return false;
    }
    public static void main(String[] args) {
        PermutationPalindrome pp=new PermutationPalindrome();
        System.out.println(pp.findEvenDigits("tact aacoa"));
    }
}


