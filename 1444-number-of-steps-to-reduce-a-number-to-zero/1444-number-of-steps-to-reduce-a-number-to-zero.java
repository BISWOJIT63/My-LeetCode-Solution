class Solution {
    public int ans(int num, int steps){
        if(num == 0) {
            return steps;
        }
        if(num%2 == 0){
            return ans(num/2,steps+1);
        }
        
        return ans(num-1,steps+1);
    }
    public int numberOfSteps(int num) {
        return ans(num,0);
    }
}