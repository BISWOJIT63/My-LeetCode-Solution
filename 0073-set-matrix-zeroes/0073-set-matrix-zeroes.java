class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean Row0 = false;
        boolean Col0 = false;
    //check any 0s available in 0th row or col
        for(int i = 0; i < n; i++) if(matrix[0][i] == 0)  Row0 = true;
        for(int i = 0; i < m; i++) if(matrix[i][0] == 0) Col0 = true;

    //set the remaining
    for(int i = 1; i < m; i++){
        for(int j = 1; j < n ; j++){
            if(matrix[i][j] == 0){
                matrix[0][j] = 0;
                matrix[i][0] = 0;
            }
        }
    }
    // then set 0 for 1th row an 1th col to last row and last col
    for(int i = 1; i < m; i++){
        for(int j = 1; j < n ; j++){
            if(matrix[0][j] ==0 || matrix[i][0]== 0){
                matrix[i][j] = 0;
            }
        }
    }
    //set 0s for 0th row and col
    if( Row0)for(int i = 0; i < n; i++){
        matrix[0][i]= 0;
    }
    if(Col0)for(int i = 0; i < m; i++){
        matrix[i][0] = 0;
    }
    }
}