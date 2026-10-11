class Solution {
    public int sumOfSquares(int[] nums) {
        int ans = 0;
        for(int i = 0 ; i < nums.length; i++){
            int j = i+1;
            if(nums.length%j == 0) {
                ans += nums[i]*nums[i];
            }
        }
        return ans;
    }
}