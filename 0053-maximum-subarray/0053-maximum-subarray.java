class Solution {
    public int maxSubArray(int[] nums) {
        int currentSum = nums[0]; // store best subarray sum ending at current index
        int maxSum = nums[0]; // store best answer found anywhere

        for (int i=1; i < nums.length; i++){
            int num = nums[i]; // get current number

            // check which is bigger, the current number if i start from here, or if i continue off
            currentSum = Math.max(num, currentSum + num);

            // check if i have a new bigger sum
            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
}
