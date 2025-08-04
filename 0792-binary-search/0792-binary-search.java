class Solution {
    private int helper(int[] nums, int target, int si, int ei){
        if(si > ei){
            return -1;
        }
        int mid = si+(ei-si)/2;
        if(nums[mid] == target){
            return mid;
        }
        else if(nums[mid] > target){
            return helper(nums,target,si,mid-1);
        }else{
            return helper(nums,target,mid+1,ei);
        }

    }
    public int search(int[] nums, int target) {
        return helper(nums,target,0,nums.length-1);

    }
}