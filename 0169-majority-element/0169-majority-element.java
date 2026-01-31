class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        // Map<Integer,Integer> seen = new HashMap<>();
        // for(int i=0;i<nums.length;i++){
        //     seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        // }
        // for(Map.Entry<Integer,Integer> mapEle : seen.entrySet()){
        //     int key = mapEle.getKey();
        //     int val = mapEle.getValue();
        //     if(val>n_by_2){
        //         return key;
        //     }
        // }
        // return -1;
        int freq = 0,ans = 0;
        for(int i=0;i<nums.length;i++){
            if(freq == 0) {
             ans = nums[i];
             freq = 1;    
            }
            else if(ans == nums[i]) freq++;
            else freq--;
        }
    int count = 0;
       for (int i = 0; i < n; i++) {
           if (nums[i] == ans)
               count++;
       }
       // Check if it occurs more than n/2 times
       if (count > n / 2)
           return ans;
       else
           return -1;
    }
}