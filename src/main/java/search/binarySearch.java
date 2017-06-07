package search;

/**
 * Created by Jhalak on 6/7/2017.
 */
public class binarySearch {

    public static int doBinarySearch(int[] arr, int elem, int low, int high){

        while(low < high) {
            int mid=(low+high)/2;
            if (arr[mid] < elem) {
                low=mid+1;
//                doBinarySearch(arr, elem, mid + 1, high);
            } else if (arr[mid] > elem) {
                high=mid;
//                doBinarySearch(arr, elem, low, mid);
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        System.out.println(doBinarySearch(arr, 1,0,arr.length));
    }
}