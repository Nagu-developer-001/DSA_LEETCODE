class Solution {
    public String simplifyPath(String path) {
        String[] paths =  path.split("/");
        Stack<String> stack = new Stack<>();
        for(int i=0;i<paths.length;i++)
        {
            if(paths[i].equals("")||paths[i].equals("."))
            {
                continue;
            }else if(paths[i].equals(".."))
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
            }else{
                stack.push(paths[i]);
            }
        }
        StringBuilder st = new StringBuilder();
        while(!stack.isEmpty())
        {
            st.insert(0,"/"+stack.pop());
        }
        if(st.length()==0){
            return "/";
        }else{
            return st.toString();
        }
    }
}