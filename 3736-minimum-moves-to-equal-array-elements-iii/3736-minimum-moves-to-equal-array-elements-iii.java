class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n-1;i++){
            ans += nums[n-1]-nums[i];
        }
        return ans;
    }
}