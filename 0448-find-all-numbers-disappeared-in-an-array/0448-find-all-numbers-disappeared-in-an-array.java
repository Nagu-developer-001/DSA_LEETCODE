class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int[] freq = new int[nums.length+1];
        for(int num:nums)
        {
            freq[num]++;
        }
        for(int i=1;i<=nums.length;i++)
        {
            if(freq[i]==0) arr.add(i);
        }
        return arr;
    }
}