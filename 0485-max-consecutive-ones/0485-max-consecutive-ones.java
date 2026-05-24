class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int[] arr = new int[nums.length];
        int cnt =0,k=0;
        for(int i =0;i<nums.length;i++)
        {
            if(nums[i] == 1)
            {
                cnt+=1;
            }else{
                if (cnt > 0){
                    arr[k] = cnt;
                cnt=0;
                k++;
                }
                
            }
        }
       if (cnt > 0) {
            arr[k] = cnt;
            k++;
        }
        int max = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;
    }
}