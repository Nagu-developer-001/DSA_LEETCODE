class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sum = n*(n+1)/2,sum1=0;
        System.out.println(sum);
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        System.out.println(sum1);
    return sum-sum1;
    }
}