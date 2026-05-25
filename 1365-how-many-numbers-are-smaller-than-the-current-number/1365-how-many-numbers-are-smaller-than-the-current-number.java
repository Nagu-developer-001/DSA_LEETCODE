class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] farr = new int[n];
        int cnt = 0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(nums[j] < nums[i] && j!=i)
                {
                    cnt++; 
                }
            }
            farr[i] = cnt;
            cnt = 0;
        }
        return farr;
    }
}