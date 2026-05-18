class Solution {
    public String decodeString(String s) {
        Stack<String> stack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder curr = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                numStack.push(num);
                stack.push(curr.toString());
                curr = new StringBuilder();
                num = 0;
            } else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder temp = new StringBuilder(stack.pop());
                for (int i = 0; i < repeat; i++) {
                    temp.append(curr);
                }
                curr = temp;
            } else {
                curr.append(ch);
            }
        }
        return curr.toString();
    }
}
