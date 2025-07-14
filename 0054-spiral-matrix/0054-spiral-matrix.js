/**
 * @param {number[][]} matrix
 * @return {number[]}
 */
var spiralOrder = function(matrix) {
    let ans = [];
    let sr = 0;
    let er = matrix.length-1;
    let sc = 0;
    let ec = matrix[0].length-1;
    while(sr <= er && sc <= ec){
        //top
         for(let j = sc; j <= ec; j++){
            ans.push(matrix[sr][j]);
         } 
         sr++;
        //right
        for(let j = sr; j <= er; j++){
            ans.push(matrix[j][ec]);
         } 
         ec--;
        //down 
        if(sr <= er){
            for(let j = ec ; j >= sc; j--){
            ans.push(matrix[er][j]);
         }
          er--;
        }
        //left
        if(sc <= ec){
            for(let j = er; j >= sr; j--){
             ans.push(matrix[j][sc]);
         } 
        sc++;
    }
        }
         
   return ans;
};