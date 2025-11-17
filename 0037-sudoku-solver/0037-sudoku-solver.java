class Solution {
    public void solveSudoku(char[][] board) {
        int n = board.length;
        backtracking(board,0,0,n);
    }
    public static boolean isSafe(char[][] board,int r, int c,int digit){
        //row
        for(int i = 0 ; i < 9; i++){
            if(i == c) continue;
            if(board[r][i] == (char)(digit + '0')){
                return false;
            }
        }
        //col
        for(int i = 0 ; i < 9; i++){
            if(i == r) continue;
            if(board[i][c] == (char)(digit + '0')){
                return false;
            }
        }
        //grid
        int sr = (r/3)*3;
        int sc = (c/3)*3;
        for(int i = sr ; i < sr+3; i++){
            for(int j = sc; j < sc+3; j++){
                if( i == r && j == c ) continue;
                if(board[i][j] == (char)(digit + '0')) return false;
            }
        }
        return true;
    }
    public static boolean backtracking(char[][] board,int r, int c,int n){
        if(r == 9){
            return true ;
        }
        if(c == 9){
           return backtracking(board,r+1,0,n);
        }
        if( board[r][c] != '.'){
           return backtracking(board,r,c+1,n);
        }
        for(int digit =1; digit <= 9; digit++){
            if(isSafe(board,r,c,digit)){
                board[r][c] = (char)(digit + '0');
               if(backtracking(board,r,c+1,n)) return true;
               board[r][c] = '.';
            }
        }
        return false;
    }
}