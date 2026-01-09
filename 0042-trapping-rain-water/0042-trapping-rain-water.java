class Solution {
    public int trap(int[] height) {
        int leftMaxArray[] = new int[height.length];
        int RightMaxArray[] = new int[height.length];
        leftMaxArray[0] = height[0];
        RightMaxArray[height.length-1] = height[height.length-1];
        for(int i=1;i<height.length-1;i++){
            leftMaxArray[i] = Math.max(leftMaxArray[i-1],height[i]);
        }
        for(int i=height.length-2;i>=0;i--){
            RightMaxArray[i] = Math.max(RightMaxArray[i+1],height[i]);
        }
        int trapWater = 0;
        for(int i=0;i<height.length-1;i++){
            int waterLevel = Math.min(leftMaxArray[i],RightMaxArray[i]);
            trapWater += waterLevel-height[i];
        }
        return trapWater;
    }
}