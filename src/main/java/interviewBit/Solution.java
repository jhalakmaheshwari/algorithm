package interviewBit;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * Created by Jhalak on 7/11/2017.
 */
public class Solution {
    ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
    int p=0;
    public ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<ArrayList<Integer>> listNew=new ArrayList<ArrayList<Integer>>();

        while(p<k){
            int i=0;
            int z=0;
            while(i<n){
                if(list.size()>0){
                    ArrayList<Integer> innerList=list.get(z);
                    int m=list.get(i).get(0)+1;
                    innerList.add(m);
                    listNew.add(innerList);
                    for(int j=1; j<k; j++){
//                        innerList.add(m);
//                        m++;
//                        listNew.add(innerList);
//                        innerList = list.get(i);
                    }
                    z++;

                }
                else{
                    for(int j=1;j<=n;j++) {
                        ArrayList<Integer> innerList = new ArrayList<Integer>();
                        innerList.add(j);
                        listNew.add(innerList);
                    }
                    list=listNew;
                    z=0;
                }
                i++;
            }

            list=listNew;
            p++;
            combine(n,k);
        }
        HashSet<ArrayList<Integer>> set=new HashSet<ArrayList<Integer>>(list);
        list=new ArrayList<ArrayList<Integer>>(set);

        for (ArrayList<Integer> aInt : list) {
            System.out.print("[ ");
            for(int l: aInt){
                System.out.print(l+ " ");
            }
            System.out.println("]");
        }


        return list;
    }

    public static void main(String[] args) {
        Solution soln=new Solution();
        soln.combine(4,2);
    }
}
