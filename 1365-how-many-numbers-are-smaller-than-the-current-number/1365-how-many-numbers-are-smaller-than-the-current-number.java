class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] farr = new int[nums.length];
        
        for(int i=0;i<nums.length;i++)
        {
            int cnt = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] < nums[i] && j!=i)
                {
                    cnt++; 
                }
            }
            farr[i] = cnt;
        }
        return farr;
    }
}