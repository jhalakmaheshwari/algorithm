package DynamicProgramming;

/**
 * Created by Jhalak on 7/31/2017.
 */
public class LongestSequence {

    static int max_ref;
    public static void main(String[] args) {
        int[] sequence = {2,4,3,5,1,7,6,9,8};
        max_ref = 1;
        System.out.println(longestseq(sequence, sequence.length));
    }

    private static int longestseq(int[] sequence, int len) {
        int[] lengthArr = new int[sequence.length];
        int[] predArr = new int[sequence.length];
        if(len == 1){
            return 1;
        }
        int recurMax = 1;
        int max_end_here = 1;
        for(int i=1; i<len; i++){
            recurMax = longestseq(sequence, i);

            if(sequence[i-1] < sequence[len-1] && recurMax + 1 > max_end_here){
                max_end_here = recurMax + 1;
            }
        }
        if(max_end_here > max_ref){
            max_ref = max_end_here;
        }
        return max_end_here;

    }

}
