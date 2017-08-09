package CodeLeet;

/**
 * Created by Jhalak on 8/9/2017.
 */
public class Problem31SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int low=0;
        int high=nums.length - 1;
        int mid=0;
        while(low<=high){
            mid = (low+high)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] < target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return low;
        // int i=0;
        // for(;i<nums.length;i++){
        //     if(target==nums[i]){
        //         return i;
        //     }
        //     else if(target<nums[i]){
        //         if(i==0){
        //             return 0;
        //         }
        //         return i;
        //     }
        // }
        // return i;
    }
}