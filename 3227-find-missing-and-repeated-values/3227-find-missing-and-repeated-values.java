class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int  n = grid.length;
        int [] ans = new int[2];
        HashMap <Integer , Integer> mp = new HashMap<>();
        for(int i = 0; i < n ; i++){
            for(int j =0; j < n; j++){
                mp.put(grid[i][j],mp.getOrDefault(grid[i][j],0)+1);
            }
        }
        for(int i = 1; i <= n*n; i++){
            int count = mp.getOrDefault(i,0);
            if(count == 2) ans[0] = i;
            if(count == 0) ans[1] = i;
        }
        return ans;
    }
}