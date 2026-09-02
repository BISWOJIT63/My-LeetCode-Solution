class Solution {
    public int[] buildArray(int[] nums) {
        int [] ans = new int[nums.length];
       int j = 0;
        for(int i = 0; i < nums.length;i++){
            ans[j] = nums[nums[i]];
            j++;
        }
       return ans;
    }
}