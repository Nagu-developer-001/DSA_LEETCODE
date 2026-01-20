class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int ans = 0;
        for(int num : nums){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }
        for (int key : freq.keySet()) {
            if(freq.get(key)==2){
                ans^=key;
            }
        }
        return ans;
    }
}