class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length-1;
        int n = matrix[0].length-1;
        int row = 0;
        int col = n;
        
        while(row <= m && col >= 0){
            int curElement = matrix[row][col];
            if(curElement == target){
                return true;
            }else if(curElement > target){
                col--;
            }else{
                row++;
            }
        }
        return false;
    }
}