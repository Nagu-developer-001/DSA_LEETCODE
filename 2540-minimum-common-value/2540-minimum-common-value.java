class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        ArrayList<Integer> result = new ArrayList<>();
        int min =Integer.MAX_VALUE;
        for(int num:nums1){
            seen.add(num);
        }
        for(int num:nums2){
            if(seen.contains(num) && !result.contains(num))
            {
                result.add(num);
            }
        }
         if (result.size() == 0) {
            return -1;
        }
        for(int num:result){
            if(num<min){
                min = num;
            }
        }
        return min;
    }
}