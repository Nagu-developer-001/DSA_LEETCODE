class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> str = new ArrayList<>();
        int cnt = 1;
        for(int num : target)
        {
            while(cnt<num)
            {
                str.add("Push");
                str.add("Pop");
                cnt++;
            }
            str.add("Push");
            cnt++;
        }
        return str;
    }
}