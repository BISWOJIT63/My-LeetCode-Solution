class Solution {
    public boolean searchMatrix(int[][] nums, int tar) {
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int si = 0;
            int ei = nums[i].length-1;
            
            while(si <= ei){
                int mid = si+(ei-si)/2;
                if(nums[i][mid] == tar){
                    return true;
                }else if(nums[i][mid] > tar){
                    ei = mid-1;
                }else{
                    si = mid+1;
                }
            }
        }
        return false;
    }
}