class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n_by_3 = nums.length/3;
        ArrayList<Integer> list = new ArrayList<>();
        Map<Integer,Integer> seen = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            seen.put(nums[i],seen.getOrDefault(nums[i],0)+1);
        }
        for(Map.Entry<Integer,Integer> mapEle : seen.entrySet()){
            int key = mapEle.getKey();
            int val = mapEle.getValue();
            if(val>n_by_3){
                list.add(key);
            }
        }
        return list;  
    }
}