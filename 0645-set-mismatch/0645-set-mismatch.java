class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int[] freq = new int[n+1];
        for(int num : nums){
            freq[num]++;
        }
        int missing = -1,duplicate = -1;
        for(int i=1;i<=n;i++){
            if(freq[i]==0)  missing=i;
            if(freq[i]>1) duplicate =i;
        }
        return new int[]{duplicate,missing};
    }
}