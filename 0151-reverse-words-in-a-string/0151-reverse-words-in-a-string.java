class Solution {
    public String reverseWords(String s) {
        String ans ="";
        Stack<String> st = new Stack<>();
        String temp = "";
        int n = s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == ' ')
            {
                if(temp.length()>0){
                    st.push(temp);
                    temp="";
                }
            }else{
                temp+=s.charAt(i);
            }
        }
        if(temp.length()>0){
            st.push(temp);
        }
        while(!st.isEmpty())
        {
            ans+=st.pop();
            if(st.size()>0){
                ans+=" ";
            }
        }
        return ans;
    }
}