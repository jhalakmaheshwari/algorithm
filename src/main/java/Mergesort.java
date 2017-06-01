/**
 * Created by Jhalak on 5/31/2017.
 */
public class Mergesort {

    public int[] Merge(int[] left, int[] right, int[] A){
        int lengthLeft=left.length;
        int lengthRight=right.length;
        int i=0;
        int j=0;
        int k=0;
//        int[] result=new int[lengthLeft+lengthRight];
        while(i<lengthLeft && j<lengthRight){
            if(left[i] <= right[j]){
                A[k]=left[i];
                i++;
                k++;
            }
            else{
                A[k]=right[j];
                j++;
                k++;
            }
        }
        while(i<lengthLeft){
            A[k]=left[i];
            i++;
            k++;
        }
        while(j<lengthRight){
            A[k]=right[j];
            j++;
            k++;
        }
        return A;
    }

    public int[] MergeSort(int[] fullArr){

        if(fullArr.length>1) {
            int mid=fullArr.length/2;
            int left[] = new int[mid];
            int right[] = new int[fullArr.length - mid];
            for (int i = 0; i < mid; i++) {
                left[i] = fullArr[i];
            }
//            int j = 0;
            for (int i = mid; i < fullArr.length; i++) {
                right[i-mid] = fullArr[i];
//                j++;
            }
            MergeSort(left);
            MergeSort(right);
            int[] result = Merge(left, right, fullArr);

            return result;
        } else {
            return fullArr;
        }
    }
    public static void main(String[] args) {
        int arr[]={4,1,5,3,8,2,9,7,6};
        Mergesort m=new Mergesort();

        int[] result = m.MergeSort(arr);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
