class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = nums[0];
        int maxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            currSum = Math.max(currSum + nums[i], nums[i]);
           // Update maxSum with the larger of maxSum and currSum
           maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }
}