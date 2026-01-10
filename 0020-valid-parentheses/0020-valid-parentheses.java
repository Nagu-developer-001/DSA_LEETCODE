class Solution {
    public boolean isValid(String s) {
        char sr[] = new char[s.length()];
        int top = -1;
        for(char ch : s.toCharArray()){
            
            if(ch == '(' || ch == '{' || ch == '['){
                sr[++top] = ch;
            }else{
                if(top == -1) return false;
                char open = sr[top--];
                if(ch == ')' && open != '(' || ch == '}' && open != '{'  || ch == ']' && open != '['){
                    return false;
                }
            }
        }
        return top == -1;
    }
}