import java.util.*;

class Solution {

    public int largestRectangleArea(int[] heights) {

        int n = heights.length;

        Stack<Integer> stack = new Stack<>();

        int maxArea = 0;

        for(int i = 0; i <= n; i++) {

            while(!stack.isEmpty() &&
                 (i == n || heights[stack.peek()] > heights[i])) {

                int height = heights[stack.pop()];

                int right = i;

                int left;

                if(stack.isEmpty()) {
                    left = -1;
                } else {
                    left = stack.peek();
                }

                int width = right - left - 1;

                int area = height * width;

                maxArea = Math.max(maxArea, area);
            }

            stack.push(i);
        }

        return maxArea;
    }
}