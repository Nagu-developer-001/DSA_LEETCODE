class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>>al = new ArrayList<>();
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length-2; i++){
            if(i>0 && nums[i]==nums[i-1])continue; 
            int low = i+1;
            int high = nums.length-1;
            int target = -nums[i];
            while(low<high){
                if(nums[low]+nums[high]==target){
                    al.add(Arrays.asList(nums[i], nums[low], nums[high]));
                    low++;
                    high--;
                    while(low<high &&nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }else if(nums[low]+nums[high]<target){
                    low++;
                }else{
                    high--;
                }
            }         
        }
        return al;
    }
}