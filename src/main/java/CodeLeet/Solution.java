package CodeLeet;

import java.util.Arrays;
import java.util.List;
import java.util.*;

/**
 * Created by Jhalak on 7/29/2017.
 */
public class Solution {
    public static List<List<String>> groupAnagrams(String[] strs) {
        String[] strBackup = new String[strs.length];
        for(int i=0; i<strs.length; i++){
            char a[]=strs[i].toCharArray();
            Arrays.sort(a);
            strBackup[i]=new String(a);
        }
        HashMap<String, ArrayList<String>> checkMap = new HashMap<String, ArrayList<String>>();
        List<List<String>> result=new ArrayList();
        for(int i=0;i<strBackup.length;i++){
            if(checkMap.containsKey(strBackup[i]))
            {
                ArrayList<String> alist = checkMap.get(strBackup[i]);
                alist.add(strs[i]);
                checkMap.put(strBackup[i], alist);
            }
            else{
                ArrayList<String> alist=new ArrayList<String>();
                alist.add(strs[i]);
                checkMap.put(strBackup[i], alist);
            }
        }
        for(Map.Entry<String, ArrayList<String>> entry: checkMap.entrySet()){
            result.add(entry.getValue());
        }

        Collections.sort(result, new Comparator<List>(){
            public int compare(List a1, List a2) {
                return a1.size() - a2.size(); // assumes you want biggest to smallest
            }
        });
        return result;

    }

    public static void main(String[] args) {
        String[] strs= {"eat", "tea", "tan", "ate", "nat", "bat"};
        groupAnagrams(strs);

    }

}