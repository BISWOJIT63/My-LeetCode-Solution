class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int max1 = nums[n-1]-nums[2];
        int max2 = nums[n-2]-nums[1];
        int max3 = nums[n-3]-nums[0];
        return Math.min(max1,Math.min(max2,max3));
    }
}