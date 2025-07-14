/**
 * @param {number[][]} matrix
 * @param {number} target
 * @return {boolean}
 */
var searchMatrix = function(matrix, target) {
    let n = matrix.length-1;
    let m = matrix[0].length-1;
    let i = 0; // i indicates the current row
    let j = m; // j indicates the current column
    while(i <= n && j >= 0){
        if( matrix[i][j] == target){
            return true;
        }else{
            if( matrix[i][j] < target){
                i++;
            }else{
                j--;
            }
        }
    }
    return false;
};