class Solution {
    public int smallestIndex(int[] nums) {
        if(nums.length == 0) return -1;
        for(int i = 0; i < nums.length;i++){
            int curNum = nums[i];
            int sum = 0;
            while(curNum != 0){
                int rem = curNum%10;
                sum += rem;
                curNum =curNum/10;
            }
            if(sum == i) return i;
        }
        return -1;
    }
}