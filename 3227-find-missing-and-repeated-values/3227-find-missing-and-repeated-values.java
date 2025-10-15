class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap <Integer,Integer> mp = new HashMap<>();
        int [] ans = new int[2];
        int n = grid.length;
        for(int i = 1; i <= n*n; i++){
            mp.put(i,0);
        }
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                mp.replace(grid[i][j],mp.get(grid[i][j])+1);
            }
        }
        for(int key : mp.keySet()){
                if(mp.get(key) == 2)
                    ans[0] = key;
                if(mp.get(key) == 0)
                    ans[1] = key;
        }
        return ans;
    }
}