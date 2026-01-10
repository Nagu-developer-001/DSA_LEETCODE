class Solution {
    public boolean isPalindrome(String s) {
        String myStr = s.replaceAll("[^A-Za-z0-9]+", "").toLowerCase();
        for(int i=0;i<myStr.length()/2;i++){
            if(myStr.charAt(i)!=myStr.charAt(myStr.length()-1-i)){
                return false;
            }
        }
        return true;
    }
}