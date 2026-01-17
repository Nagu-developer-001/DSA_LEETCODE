class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> seen = new HashSet<>();
        for(int num:nums1){
                seen.add(num);
        }
        ArrayList<Integer> result = new ArrayList<>();
        for(int num:nums2){
            if(seen.contains(num) && !result.contains(num)){
                result.add(num);
            }
        }
        System.out.println(result);
        int[] result1 = result.stream().mapToInt(Integer::intValue).toArray();
        //Object[] arr = result.toArray(); 
        System.out.println(result1);
        return result1;
    }
}