class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean first_row_zero = false;
        boolean first_col_zero = false;

        //check for 1st row
        for(int i = 0; i < m; i++){
            if(matrix[i][0] == 0) {
                first_row_zero = true;
                break;
            }
        }

        //check for 1st col
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0){
                 first_col_zero = true;
                  break;
                }
        }
        //check remaining rows and columns by set zero for 1st row and coumn as marker
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }  
        //set 0s according to marker
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }  
        if(first_row_zero){
            for(int i = 0; i < m; i++){
                matrix[i][0] = 0;
            }
        }      
        if(first_col_zero){
            for(int i = 0; i < n; i++){
                matrix[0][i] = 0;
            }
        } 
    }
}