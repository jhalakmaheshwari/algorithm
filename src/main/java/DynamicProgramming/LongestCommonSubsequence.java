package DynamicProgramming;

import java.util.HashMap;

/**
 * Created by Jhalak on 8/1/2017.
 */
public class LongestCommonSubsequence {

    class LengthXY{
        private int xlength, ylength;
        LengthXY(int xlength, int ylength){
            this.xlength=xlength;
            this.ylength=ylength;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof LengthXY)) return false;

            LengthXY lengthXY = (LengthXY) o;

            if (xlength != lengthXY.xlength) return false;
            return ylength == lengthXY.ylength;
        }

        @Override
        public int hashCode() {
            int result = xlength;
            result = 31 * result + ylength;
            return result;
        }
    }

    public static void main(String[] args) {
        String X = "ABCBDAB";
        String Y = "BDCABA";
        LongestCommonSubsequence lcs=new LongestCommonSubsequence();
        System.out.println(lcs.LCS(X,Y));
    }
    static HashMap<LengthXY, String> hmMemoize = new HashMap<LengthXY, String>();
    private String LCS(String X, String Y) {
        int m = X.length();
        int n= Y.length();
        if(m==0 || n==0){
            return "";
        }
        else if(X.charAt(0) == Y.charAt(0)){
            LengthXY l = new LengthXY(m-1,n-1);
            if(hmMemoize.containsKey(l)){
                System.out.println("CONTAINS");
            }
            else{
                hmMemoize.put(l, LCS(X.substring(1,m), Y.substring(1,n)));
            }
            return X.charAt(0) + hmMemoize.get(l);
        }
        else{
            LengthXY l = new LengthXY(m-1,n);
            if(hmMemoize.containsKey(l)){
                System.out.println("CONTAINS");
            }
            else{
                hmMemoize.put(l, LCS(X.substring(1,m), Y));
            }
            String x = hmMemoize.get(l);
            l = new LengthXY(m,n-1);
            if(hmMemoize.containsKey(l)){
                System.out.println("CONTAINS");
            }
            else{
                hmMemoize.put(l, LCS(X, Y.substring(1,n)));
            }

            String y = hmMemoize.get(l);
            return (x.length() > y.length()) ? x:y;
        }
    }
}
