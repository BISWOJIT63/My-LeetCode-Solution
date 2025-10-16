class Solution {
    public double myPow(double x, int n) {
        long N = n; // to avoid overflow
        if(N < 0){
            x = 1/x;
            N = -N;
        }
        return ans(x,N);
    }
    public double ans(double x, long n){
        if(n == 0){
            return 1;
        }
        double halfPow = ans(x,n/2);
        if(n%2 == 0){
            return halfPow*halfPow;
        }
        return x*halfPow*halfPow;
    }
}