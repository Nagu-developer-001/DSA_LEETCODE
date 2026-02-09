class Solution {
    public boolean isAnagram(String s, String t) {
        // char ss[] = s.toCharArray();
        // Arrays.sort(ss);
        // String str = new String(ss);
        // char ts[] = t.toCharArray();
        // Arrays.sort(ts);
        // String str1 = new String(ts);
        // return str.equals(str1);
        //if(s.length() != t.length()) return false;
        // HashMap<Character,Integer> m1= new HashMap<>();
        // HashMap<Character,Integer> m2= new HashMap<>();
        // for(int i = 0;i<s.length();i++){
        //     m1.put(s.charAt(i),m1.getOrDefault(s.charAt(i),0)+1);
        //     m2.put(t.charAt(i),m2.getOrDefault(t.charAt(i),0)+1);
        // }
        int len_s = s.length(),len_t = t.length();
        if(len_s!=len_t) return false;
        int count[] = new int[26];
        //int count1[] = new int[26];
        for(int i=0;i<s.length();i++){
            count[s.charAt(i)-'a']++;
            //count[s.charAt(i)-'a']--;
        
            //count[s.charAt(i)-'a']++;
            count[t.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(count[i]!=0){
                return false;
            }
        }
        return true;
    }
}