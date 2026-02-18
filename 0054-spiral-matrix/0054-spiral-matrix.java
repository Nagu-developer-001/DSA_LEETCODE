class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> matrixs = new ArrayList<>();
        int startRow = 0;
        int startCol = 0;
        int endRow = matrix.length-1;
        int endCol = matrix[0].length-1;
        while(startRow<=endRow && startCol<=endCol){
            //top
            for(int j=startCol;j<=endCol;j++){
                matrixs.add(matrix[startRow][j]);
            }
            //Right
            for(int i=startRow+1;i<=endRow;i++){
                //if(endCol>=0){
                matrixs.add(matrix[i][endCol]);
                //}else{
                  //  break;
                //}
            }
            //Bottom print bottom rows
            if (startRow < endRow) {
                for(int j=endCol-1;j>=startCol;j--){
                //if(startRow==endRow){
                  //  break;
                //}
                matrixs.add(matrix[endRow][j]);
            }
            }
            
            //Left Printing left columns
            if (startCol < endCol) 
            {
                for(int i=endRow-1;i>startRow;i--){
                matrixs.add(matrix[i][startCol]);
            }
            }
            
            startRow+=1;
            startCol+=1;
            endRow-=1;
            endCol-=1;
        }
        return matrixs;
    }
}