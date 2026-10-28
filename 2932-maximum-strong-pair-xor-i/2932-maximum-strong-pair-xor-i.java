class Solution {
    public int maximumStrongPairXor(int[] nums) {
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i ; j < nums.length;j++){
                int m = nums[i]-nums[j];
                if(m < 0) m = -m;
                if(m <= Math.min(nums[i],nums[j])){
                    int xor = nums[i]^nums[j];
                    ans = Math.max(xor,ans);
                }
            }
        }
        return ans;
    }
}