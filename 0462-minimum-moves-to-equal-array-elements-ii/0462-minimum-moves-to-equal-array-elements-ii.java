class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int ans =0;
        int n = nums.length;
        int mid=n/2;
        

        for(int i = 0; i < n; i++){
            if(i < mid){
                ans += nums[mid]-nums[i];
            }else{
                ans += nums[i]-nums[mid];
            }

        }
        return ans;
    }
}