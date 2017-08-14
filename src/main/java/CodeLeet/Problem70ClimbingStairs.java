package CodeLeet;

import java.util.HashMap;

/**
 * Created by Jhalak on 8/10/2017.
 */
public class Problem70ClimbingStairs {
    HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
    public int climbStairs(int n) {
        if(n<2){
            return 1;
        }
        if(!map.containsKey(n-1))
        {
            map.put(n-1, climbStairs(n-1));
        }
        if(!map.containsKey(n-2))
        {
            map.put(n-2, climbStairs(n-2));
        }


        int total = map.get(n-1)+map.get(n-2);
        return total;

    }
}
