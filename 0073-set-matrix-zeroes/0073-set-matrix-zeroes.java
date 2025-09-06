class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row[] = new int[m];
        int col[] = new int[n];
        for(int i = 0; i < m; i++){
            row[i] = -1;
        }
       for(int i = 0; i < n; i++){
        col[i] = -1;
       }
        for(int i = 0; i< m; i++){
            for(int j = 0; j < n; j++ ){
                if(matrix[i][j] == 0){
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
        for(int i = 0; i < m; i++){
            if(row[i] == 0){
                int j = 0;
                while(j < n){
                    matrix[i][j] = 0;
                    j++;
                }
            }
        }
        for(int j = 0; j < n; j++){
            if(col[j] == 0){
                int i = 0;
                while(i < m){
                    matrix[i][j] = 0;
                    i++;
                }
            }
        }

    }
}