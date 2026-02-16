class Solution {
    public int diagonalSum(int[][] mat) {
        int diaSum = 0;
        int n = mat.length;
        for(int i=0;i<n;i++){
            //Primary diagonal
            diaSum+=mat[i][i];
            //secondary sum
            if(i!=n-1-i){//(Skipping the same element traverse)
                diaSum+=mat[i][n-1-i];
            }
        }
        return diaSum;
    }
}