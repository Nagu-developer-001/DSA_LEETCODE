class Solution {
    public boolean check(int[] nums) {
        int count = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i]>=nums[i-1]){
                continue;
            }else{
                count+=1;
            }
        }
        if(nums[nums.length-1]>nums[0]){
            count+=1;
        }
        System.out.println(count);
        if(count<=1){
            return true;
        }else{
            return false;
        }
    }
}