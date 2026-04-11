class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;
        //System.out.print(end);
        while(start<=end){
            int mid = (start+end)/2;
            //System.out.print(mid);
            if(nums[mid]==target){
                return mid;
            }else if(nums[start]<=nums[mid]){
                if(target>=nums[start] && target<=nums[mid]){
                    end = mid;
                }else{
                    start = mid+1;
                }
            }else{
                if(target>=nums[mid+1] && target<=nums[end]){
                    start = mid+1;
                }else{
                    end=mid;
                }
            }
    }
    return -1;
}
}