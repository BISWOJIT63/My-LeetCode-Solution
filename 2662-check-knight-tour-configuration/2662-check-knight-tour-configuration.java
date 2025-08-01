class Solution {
    public boolean check(int[][] grid, int x, int y,boolean [][] isVisit,int n, int value){
        //x row and y col
        if(grid[x][y] == n*n-1){
            return true;
        }
        int dx[] = {-2,-2,+2,+2,+1,-1,-1,+1};
        int dy[] = {-1,+1,+1,-1,-2,-2,+2,+2};
        for(int i =0; i < dx.length;i++){
            int nextX = x+dx[i];
            int nextY = y+dy[i];
            if(isSafe( grid, nextX, nextY,isVisit,value+1,n)){
                isVisit[nextX][nextY] = true;
                if (check(grid, nextX, nextY, isVisit, n, value + 1)) {
                    return true;
                }
                isVisit[nextX][nextY] = false;
            }
        }
        return false;
    }
    public boolean isSafe(int[][] grid,int x,int y,boolean [][]isVisit,int value,int n){
        if((x >= 0 && y >= 0 && x < n && y < n && !isVisit[x][y]) && grid[x][y] == value) return true;
        return false;
    }
    public boolean checkValidGrid(int[][] grid) {
        int n = grid.length;
        if(grid[0][0] != 0){
            return false;
        }
        boolean [][] isVisit = new boolean[n][n]; 
        isVisit[0][0] = true;
        return check(grid,0,0,isVisit,n,0);
    }
}