class Solution {
    public int mostWordsFound(String[] sentences) {
        int cnt = 0;
        int max = 0;
        for(int i=0;i<sentences.length;i++)
        {
            String sentence =sentences[i]; 
            cnt= 0;
            for(int j=0;j<sentence.length();j++)
            {
                if(sentence.charAt(j) == ' '){
                    cnt++;
                }
                max = Math.max(cnt,max);
            }
        }
        return max+1;
    }
}