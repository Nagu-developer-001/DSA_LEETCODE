class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[nums.length];
        int low=0,high=n,k=0;
        while(low<n && 0<n*2){
            result[k++] = nums[low++];
            result[k++] = nums[high++];
        }
        return result;
    }
}