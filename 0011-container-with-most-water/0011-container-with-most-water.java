class Solution {
    public int maxArea(int[] height) {
        int maxConatiner = 0;
        int lp = 0,rp = height.length-1;
        while(lp<rp){
            int temp = Math.min(height[lp],height[rp]);
            int width = rp-lp;
            int currHeight = temp*width;
            maxConatiner = Math.max(currHeight,maxConatiner);
            if(height[lp]<height[rp]) lp++;
            else rp--;
        }
        return maxConatiner;
    }
}