class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length()-1;
        int j = num2.length()-1;
        int carry = 0;
        int sum = 0;
        String output = "";
        while(i>=0 || j>=0){
            int one = i>=0?num1.charAt(i) - '0':0;
            int two = j>=0?num2.charAt(j) - '0':0;
            sum = one+two+carry;
            carry = sum/10;
            sum = sum%10;
            output = sum+output;
            i--;
            j--;
        }
        if(carry>0){
            output = carry+output;
        }
        return output;
    }
}