class Solution {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }
        int start = 1;
        int end = x;
        while(start <= end ){
            int m = start+(end-start)/2;
            if((long) m*m  == x){
                return m;
            }else if((long) m*m > x){
                end = m-1;
            }else{
                start = m+1;
            }
        }
        return Math.round(end);
    }
}