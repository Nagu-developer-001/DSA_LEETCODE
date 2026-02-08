class Solution {
    public String removeOccurrences(String s, String part) {
        while(s.indexOf(part)!=-1){
            int pos = s.indexOf(part);
            s = s.substring(0,pos)+s.substring(pos+part.length());
        }
        return s;
    }
}