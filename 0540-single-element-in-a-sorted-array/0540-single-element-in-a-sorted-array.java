class Solution {
    public int singleNonDuplicate(int[] nums) {
        int i = 0;
        while(i < nums.length-1){
            int j = i+1;
            if(nums[i] == nums[j]){
                i+=2;
            }else{
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }
}