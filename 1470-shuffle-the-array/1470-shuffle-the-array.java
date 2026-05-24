class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] arr = new int[n*2];
        boolean x1 = true;
        int k=0;
        for(int i = 0;i<nums.length;i++){
            if(x1){
                arr[i] = nums[k];k++;
                x1= false;
            }else{
                arr[i] = nums[n];n++;
                x1 = true;
            }
        }
        return arr;
    }
}