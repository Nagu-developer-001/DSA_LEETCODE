class Solution {
    public int findLucky(int[] arr) {
       Map<Integer,Integer> lucky = new HashMap<>();
       for(int ar:arr){
        lucky.put(ar,lucky.getOrDefault(ar,0)+1);
       }
       int result = -1;
        for(Map.Entry<Integer,Integer> mapEle : lucky.entrySet()){
            int key = mapEle.getKey();
            int val = mapEle.getValue();
            System.out.print(key+" "+val);
            if(key==val){
                result = Math.max(result,key);
            }
        }
        return result;
    }
}