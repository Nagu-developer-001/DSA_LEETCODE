class Solution {
    public int compress(char[] chars) {
        StringBuilder s = new StringBuilder("");
        for(int i=0;i<chars.length;i++){
            int count = 1;
            while(i<chars.length-1 && chars[i]==chars[i+1]){
                count+=1;
                i+=1;
            }
            s.append(chars[i]);
            if(count>1){
                s.append(count);
            }
        }
        char[] c = s.toString().toCharArray();
        for(int i=0;i<c.length;i++){
            chars[i] = c[i];
        }
        return s.length();
    }
}