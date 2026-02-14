class Solution {
    public boolean isCap(char ch){
        if(ch>='A' && ch<='Z'){
            return true;
        }
        return false;
    }
    public boolean detectCapitalUse(String word) {
        int cnt = 0;
        if(word.length()==1){
            return true;
        }
        for(int i=0;i<word.length();i++){
            if(isCap(word.charAt(i))){
                cnt++;
            }
        }
        if(cnt==word.length()) return true;
        if(cnt==0) return true;
        if(cnt==1 && isCap(word.charAt(0))) return true;


        return false;
    }
}