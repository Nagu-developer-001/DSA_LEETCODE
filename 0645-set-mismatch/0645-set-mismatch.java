class Solution {
    public int[] findErrorNums(int[] nums) {
        int n = nums.length;
        int sum_nums = n * (n+1)/2;
        int sum_set = 0;
        int missing = -1;
        HashSet<Integer> set = new HashSet<>();
        int[] arr = new int[2];
        for(int i = 0; i < n ;i++)
        {
            if(set.contains(nums[i]))
            {
                missing = nums[i];
            }else{
                set.add(nums[i]);
            }
        }
        for(int num : set){
            sum_set+=num;
        }
        System.out.println(sum_set+" "+missing+" "+sum_nums+" "+n);
        arr[0] = missing;
        arr[1] = sum_nums - sum_set;
        return arr;
    }
}