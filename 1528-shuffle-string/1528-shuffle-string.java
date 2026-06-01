class Solution {
    public String restoreString(String s, int[] indices) {
        char[] t = new char[s.length()];   // create a char array of same length
        for (int i = 0; i < s.length(); i++) {
            System.out.println(indices[i]+" ->"+s.charAt(i));
            t[indices[i]] = s.charAt(i);   // place each character at the right index
        }
        return new String(t);
    }
}