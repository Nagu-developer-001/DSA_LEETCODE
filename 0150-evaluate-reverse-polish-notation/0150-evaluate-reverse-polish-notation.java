class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st =new Stack<>();
        for(String ele:tokens)
        {
            if(ele.equals("+") || 
               ele.equals("-") ||
               ele.equals("*") ||
               ele.equals("/"))
               {
                    int a = st.pop();
                    int b = st.pop();
                    if(ele.equals("+")){ st.push(b+a);}
                    else if(ele.equals("-")){ st.push(b-a);}
                    else if(ele.equals("*")){ st.push(b*a);}
                    else{ st.push(b/a);}
               }else{
                    st.push(Integer.parseInt(ele));
               }
        }
        return st.pop();
    }
}