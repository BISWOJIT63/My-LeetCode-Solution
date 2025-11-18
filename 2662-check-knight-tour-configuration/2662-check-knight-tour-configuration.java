class Solution {
    public boolean checkValidGrid(int[][] grid) {
        if(grid[0][0] != 0) return false;
      return backtracking(grid,0,0,0);
    }
    public static boolean backtracking(int[][] grid , int row , int col,int val){
        if((grid.length*grid.length)-1 == val){
            return true;
        }
        int[] dirRow = {-1,-1,-2,2,1,1,-2,2};
        int[] dirCol = {2,-2,1,1,2,-2,-1,-1};
        for(int i = 0; i < 8; i++){
            int nextRow = row+dirRow[i];
            int nextCol = col+dirCol[i];
            if(isSafe(grid,nextRow,nextCol,val+1)){
                return backtracking(grid,nextRow,nextCol,val+1);
            }
        }
        return false;
    }
    public static boolean isSafe(int[][] grid,int r, int c,int val){
        return (r >= 0 && r < grid.length &&
                c >= 0 && c < grid.length &&
                grid[r][c] == val);
    }
}