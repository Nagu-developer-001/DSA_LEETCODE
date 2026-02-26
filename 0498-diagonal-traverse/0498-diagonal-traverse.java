class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[] res = new int[m*n];
        int row = 0,col = 0;
        boolean upwards = true;
        for(int i=0;i<m*n;i++){
            res[i] = mat[row][col];
            if(upwards){
        if(col == n-1){
            row++;
            upwards = false;
        }
        else if(row == 0){
            col++;
            upwards = false;
        }
    else{
        row--;
        col++;
    }
}
             else{
                if(row == m-1){
                    col++;
                    upwards = true;
                }
                else if(col == 0){
                    row++;
                    upwards = true;
                }
                else{
                    row++;
                    col--;
                }
            }
        }
        return res;
    }
}