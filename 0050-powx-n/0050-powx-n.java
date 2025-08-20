class Solution {
    public double myPow(double x, int n) {
        double ans = 1;
        long m = n;
        if(n < 0){
            x = 1/x;
             m= -m;
        }
        while(m > 0){
           if(m % 2 == 1){
            ans *= x;
            m--;
           }else{
            x = x*x;
            m /= 2;
           }
        }
        return ans;
    }
}