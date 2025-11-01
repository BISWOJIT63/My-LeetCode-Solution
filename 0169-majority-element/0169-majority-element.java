class Solution {
    public static int count(int[] nums,int n, int lo,int hi){
        int count = 0;
        for(int i = lo; i <= hi; i++){
            if(nums[i] == n){
                count++;
            }
        }
        return count;
    }
    public static int majorityElementRec(int[] nums, int lo, int hi){
        if(hi == lo){
            return nums[lo];
        }
        int mid = lo+(hi-lo)/2;
        int left = majorityElementRec(nums,lo,mid);
        int right = majorityElementRec(nums,mid+1,hi);
        if(left == right){
            return left;
        }
        int leftCount = count(nums,left,lo,hi);
        int rightCount = count(nums,right,lo,hi);
        return (leftCount > rightCount) ? left :right;
    }
    public int majorityElement(int[] nums) {
        if(nums.length == 1){
            return nums[0];
        }
        return majorityElementRec(nums,0,nums.length-1);
    }
}