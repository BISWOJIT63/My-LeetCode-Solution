class Solution {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean firstRowZero = false;
        boolean firstColZero = false;

        //check zero in 1st row 
        for(int i = 0; i < n; i++){
            if(matrix[0][i] == 0){
             firstRowZero = true;
             break;
            }
        }
        //check zero in 1st col
       for(int i = 0; i < m; i++){
        if(matrix[i][0] == 0){
           firstColZero = true;
           break;
        }
       }
       //marking zero
       //set 0 in ith rows 1st row if any of zero occure in ith row 
       //set 0 in ith col's 1st col if any of zero occure in ith col
        for(int i = 1; i< m; i++){
            for(int j = 1; j < n; j++ ){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        //set zero for answer according to the mark
        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){

                if(matrix[i][0] == 0 || matrix[0][j] == 0){
                    matrix[i][j] = 0;
                }
            }
        }
        //set 0 according conditions

        if(firstRowZero){
             for(int j = 0; j < n; j++){
                matrix[0][j] = 0;
             }
        }
         if(firstColZero){
             for(int j = 0; j < m; j++){
                matrix[j][0] = 0;
             }
        }
    }
}