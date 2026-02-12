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
    for(int i = 0;i<matrix.length;i++){
        int j = FindBinarySearch(matrix[i],target);
        if(j!=-999){
            return true;
        }
    }
    return false;
}
}