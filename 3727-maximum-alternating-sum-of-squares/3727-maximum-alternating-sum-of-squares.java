class Solution {
    public long maxAlternatingSum(int[] nums) {
        if(nums.length == 0) return 0;
        long score = 0;
        int i = 0;
        int j = nums.length/2;
        for(int k = 0; k < nums.length;k++){
            nums[k] *= nums[k];
        }
        Arrays.sort(nums);
        while(i <  nums.length/2 && j <  nums.length){
            score += nums[j]-nums[i];
            i++;
            j++;
        }
        if(j < nums.length){
            score +=nums[j];
        }
        return score;
    }
}