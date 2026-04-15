class Solution {
    public int searchInsert(int[] nums, int target) {
        int low = 0,high = nums.length-1;
        int locator = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(nums[mid]==target){
                return mid;
            }else if(nums[mid]<target){
                //locator = mid+1;
                low = mid+1;
            }else{
                //if(high>=1){
                    //locator = mid -1;
                high = mid-1;
                //}
            }
        }  
        return low;
    }
}