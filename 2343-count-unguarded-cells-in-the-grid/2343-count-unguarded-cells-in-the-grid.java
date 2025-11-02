class Solution {
    public int countUnguarded(int m, int n, int[][] guards, int[][] walls) {
        char ans[][] = new char[m][n];

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = '.';
            }
        }
        for(int i = 0; i < guards.length; i++){
            
               ans[guards[i][0]][guards[i][1]] = 'G';
            
        }
        for(int i = 0; i < walls.length; i++){
           
               ans[walls[i][0]][walls[i][1]] = 'W';
            
        }
        // Directions: up, right, down, left
        int[][] dirs = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

        // Guard vision marking
        for (int i = 0; i < guards.length; i++) {
            int row = guards[i][0];
            int col = guards[i][1];

            for (int[] dir : dirs) {
                int r = row + dir[0];
                int c = col + dir[1];

                while (r >= 0 && r < m && c >= 0 && c < n) {
                    if (ans[r][c] == 'W' || ans[r][c] == 'G') break;
                    ans[r][c] = 'V'; // V for visible
                    r += dir[0];
                    c += dir[1];
                }
            }
        }
        int count = 0;
        for(int i = 0; i < m ; i++){
            for(int j = 0; j < n; j++){
                if(ans[i][j] == '.'){
                    count++;
                }
            }
            
        }
        return count;
    }
}