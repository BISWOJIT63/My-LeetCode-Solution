class Solution {
    public boolean searchMatrix(int[][] nums, int tar) {
        int m = nums.length;
        int n = nums[0].length;
        int row = 0;
        int col = n-1;
            
            while(row < m && col >= 0){
               if(nums[row][col] == tar){
                return true;
               }else if(nums[row][col] > tar){
                col--;
               }else{
                row++;
               }
            }
        return false;
    }
}