class Solution {
    public int majorityElement(int[] nums) {
        int n_by_2 = nums.length/2;
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mapEle : seen.entrySet()){
            int key = mapEle.getKey();
            int val = mapEle.getValue();
            if(val>n_by_2){
                return key;
            }
        }
        return -1;
    }
}