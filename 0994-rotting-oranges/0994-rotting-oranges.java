class Solution {
    public int orangesRotting(int[][] grid) {
        //take a array value(store the grid row,col,and intially 0 for time) queue
        Queue<int[]> q = new LinkedList<>();
        
        //then iterate on the grid and put all the alredy rotted oranges and count the fresh orngs 
        int fresh = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == 2){
                    q.add(new int[]{i,j,0});
                }
                if(grid[i][j] == 1) fresh++;
            }
        }

        //if there is no fresh orranges means 
        if(fresh == 0) return 0;


        //track the total munites take to rooten
        int minutes = 0;
        //track how many fresh orranges are rotting
        int rotted = 0;

        //take the front elemnt of the queue and check for that while empty
        while(!q.isEmpty()){
        
            int[] arr = q.remove();
            int r = arr[0];
            int c = arr[1];
            int time = arr[2];
            //then check its neighbores (4 directions)
            int[][] dir = {{1,0},{-1,0},{0,-1},{0,1}};
            for(int[] d : dir){
                int nr = r+d[0];
                int nc = c+d[1];
                if(nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 1){
                    grid[nr][nc] = 2;
                    rotted++;
                    q.add(new int[]{nr,nc,time+1});
                    minutes = Math.max(minutes,time+1);
                }
            }
        }
        //if all the fresh orranges  are rotted then return max time take to rooten all the orngs
        //if thre is reamin at least 1 oranges is fresh then return -1
        return (fresh == rotted) ? minutes : -1;
    }
}