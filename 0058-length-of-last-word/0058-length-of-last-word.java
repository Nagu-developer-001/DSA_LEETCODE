class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedValue = s.trim();
        int count = 0;
        for(int i=trimmedValue.length()-1;i>=0;i--){
            if(trimmedValue.charAt(i)!=' '){
                count+=1;
            }else{
                break;
            } 
        }
        return count;
    }
}