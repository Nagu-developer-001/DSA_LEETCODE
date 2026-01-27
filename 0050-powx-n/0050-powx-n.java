class Solution {
    public double myPOWOP(double x,long n){
        if(n==0) return 1;
        double half_powered = myPOWOP(x,n/2);
        if(n%2!=0) return x*half_powered*half_powered;
        return half_powered*half_powered; 
    }
    public double myPow(double x, long n) {
        if(x==0||x==1) return x;
        if(n<0) return myPOWOP(1/x,-n);
        return myPOWOP(x,n);
    }
}