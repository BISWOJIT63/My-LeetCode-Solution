class Solution {
    public int minimumOperations(int[] nums) {
        int c = 0;
        for(int i = 0; i < nums.length; i++){
            c += Math.min(nums[i] % 3, 3 - (nums[i] % 3));
        }
        return c;
    }
}