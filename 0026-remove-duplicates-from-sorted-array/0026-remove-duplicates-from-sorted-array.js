/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {
    k=0;
    //g = []
    for(i=1;i<nums.length;i++){
        if(nums[k]!=nums[i]){
            k++;
            nums[k]=nums[i]
        }
    }return k+1;
};