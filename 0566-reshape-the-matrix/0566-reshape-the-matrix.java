class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int rows = mat.length;
        int cols = mat[0].length;
        int total = rows * cols;

        // Check if reshape is possible
        if (total != r * c) {
            return mat;
        }

        int[][] newMat = new int[r][c];
        int row = 0, col = 0;

        // Fill new matrix row by row
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newMat[row][col] = mat[i][j];
                col++;
                if (col == c) {
                    col = 0;
                    row++;
                }
            }
        }

        return newMat;
    }
}