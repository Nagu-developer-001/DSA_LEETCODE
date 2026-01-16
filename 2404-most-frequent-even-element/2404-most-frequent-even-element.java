class Solution {
    public int mostFrequentEven(int[] nums) {
        Map<Integer,Integer> seen = new HashMap<>();
        for(int num:nums){
            if(num%2==0){
                seen.put(num,seen.getOrDefault(num,0)+1);
            }
        }
        int most_frequent = -1;
        int max_count = 0;
        for(Map.Entry<Integer,Integer> mapEle:seen.entrySet()){
            int num = mapEle.getKey();
            int count = mapEle.getValue();
            //System.out.println(val);
            if(count>max_count||count == max_count && num<most_frequent){
                most_frequent = num;
                max_count = count;
            }
        }
        return most_frequent;
    }
}