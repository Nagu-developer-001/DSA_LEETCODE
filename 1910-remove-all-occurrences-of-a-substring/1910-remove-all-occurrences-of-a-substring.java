class Solution {
    public String removeOccurrences(String s, String part) {
        //int pos=-1;
        while(true){
            int pos = -1;
            for(int i=0;i<=s.length()-part.length();i++){
                if(s.substring(i,i+part.length()).equals(part)){
                    pos = i;
                    break;
                }
            }
            //int pos = s.indexOf(part);
            
            if(pos==-1) break;
            s = s.substring(0,pos)+s.substring(pos+part.length());
        }
        return s;
    }
}