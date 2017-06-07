package Bits;

/**
 * Created by Jhalak on 6/3/2017.
 */
public class Insertion {
    public int bitInsertion(int N, int M, int i, int j){
        int allones=~0;
        int left = allones << (j+1);
        int right = (1<<i) -1;

        int mask = left | right;
        int clear_n=N & mask;
        int mShift = M << i;
        int result = clear_n | mShift;
        return result;
    }

    public static void main(String[] args) {
        Insertion i = new Insertion();
        System.out.println(Integer.toBinaryString(i.bitInsertion(Integer.parseInt("10000000000", 2), Integer.parseInt("10011", 2), 2 ,6 )));

    }
}
