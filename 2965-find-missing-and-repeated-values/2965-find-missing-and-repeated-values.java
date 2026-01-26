class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Set<Integer> s = new HashSet<>();
        int[] result = new int[2];
        int n = grid[0].length;
        int expected_ans =0;
        int actual_sum = 0;
        int a=0,b=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                actual_sum+=grid[i][j];
                if(s.contains(grid[i][j])){
                    a = grid[i][j];
                    result[0] = a;
                }
                s.add(grid[i][j]);
            }
        }
        int total = (n*n);
        expected_ans =total*(total+1)/2;
        b = expected_ans + a - actual_sum;
        result[1] = b;
        return result;
    }
}