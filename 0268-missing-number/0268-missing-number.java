class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int high = -1;
        // for(int i=0;i<n;i++){
        //     if(nums[i]>high){
        //         high = nums[i];
        //     }
        // }
        int sum = 0,sum1=0;
        for(int i=0;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
        for(int i=0;i<n;i++){
            sum1+=nums[i];
        }
        System.out.println(sum1);
    return sum-sum1;
    }
}