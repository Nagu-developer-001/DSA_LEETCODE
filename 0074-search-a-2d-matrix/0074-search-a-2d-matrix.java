class Solution {
    public int FindBinarySearch(int[] matrix, int target){
        int low = 0,high = matrix.length-1;
        while(low<=high){
            int mid = (low+high)/2;
            if(matrix[mid] == target){
                return mid;
            }else if(matrix[mid]<target){
                low = mid+1;
            }else{
                high = mid-1;
            }
        }
        return -999;
    }
    public boolean searchMatrix(int[][] matrix, int target) {
    //     int row = 0 ,col = matrix[0].length-1;
    //     while(row<=matrix.length-1 && col>=0){
    //         if(matrix[row][col] == target){
    //             return true;
    //         }else if(matrix[row][col] <= target){
    //             row+=1;
    //         }else{
    //             col-=1;
    //         }
    //     }
    //     return false;
    // }
    for(int i = 0;i<matrix.length;i++){
        int j = FindBinarySearch(matrix[i],target);
        if(j!=-999){
            return true;
        }
    }
    return false;
}
}