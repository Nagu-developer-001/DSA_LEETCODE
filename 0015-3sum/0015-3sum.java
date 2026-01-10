class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //int n = nums.length;
        //int sum = 0;
        Arrays.sort(nums);
        List<List<Integer>> Result = new ArrayList<>();
        Set<List<Integer>> uniqueSum = new HashSet<>(); 
    for(int i=0;i<nums.length-2;i++){
        int low = i+1;
        int high = nums.length-1;
        while(low<high){
        //System.out.println("["+nums[i]+","+nums[low]+","+nums[high]+"] and n="+n+"k="+low+"j="+high+"i="+i);
        //int sum = nums[i]+nums[low]+nums[high];
        if(nums[i]+nums[low]+nums[high]==0){
            List<Integer> triplet = Arrays.asList(nums[i],nums[low],nums[high]);
                    //System.out.print(triplet);
            Collections.sort(triplet);
                    //System.out.print(triplet);
            uniqueSum.add(triplet);
            while(low<high && nums[low]==nums[low+1]){
                low+=1;
            }
            while(low<high && nums[high]==nums[high-1]){
                high-=1;
            }
            low+=1;
            high-=1;
                }
        else if(nums[i]+nums[low]+nums[high]<0){
            low+=1;
        }
        else if(nums[i]+nums[low]+nums[high]>0){
            high-=1;
        }
        }
        
    }
        //i+=1;
    Result.addAll(uniqueSum);
    return Result;
    }
}