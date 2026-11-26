class Solution {
    public int countDominantElements(int[] nums) {
        int count = 0;

        int n = nums.length;
        if (n == 0 || n == 1)
            return n;
        if (nums[0] >= nums[1] ) {
                count++;
            }
        if(nums[n-1] >= nums[n-2]) count++;
        
        for (int i = 1; i < n-1; i++) {
             if (i < n - 1 && i > 0 && (float)nums[i] >= (float)(nums[i + 1] + nums[i - 1]) / 2)
                count++;

        }
        return count;
    }
}