class Solution {
    public boolean isValidSudoku(char[][] board) {
       return backtracking(board,0,0);

    }
    public static boolean backtracking(char[][] board,int row, int col){
        if(row == 9){
            return true;
        }
        if(col == 9){
            return backtracking(board, row + 1, 0);
        }
        if(board[row][col] == '.'){
           return backtracking(board,row,col+1);
        }
        if(!isSafe(board,row,col,board[row][col])){
            return false;
        }
        return backtracking(board,row,col+1);
    }
    public static boolean isSafe(char[][] board,int row, int col,int dig){
        //row
        for(int i = 0; i < 9; i++){
            if(i == col ) continue;
            if(board[row][i] == dig){
                return false;
            }
        }
        //col
        for(int i = 0; i < 9; i++){
            if(i == row) continue;
            if(board[i][col] == dig){
                return false;
            }
        }
        //grid
        int r = (row/3)*3;
        int c = (col/3)*3;
        for(int i = r; i < r+3; i++){
            for(int j = c; j < c+3; j++){
                if(i ==  row && j == col) continue;
                if(board[i][j] == dig){
                    return false;
                }
            }
        }
        return true;
    }
}