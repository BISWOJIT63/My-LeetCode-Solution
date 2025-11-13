class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans = new ArrayList<>();
        char[][]  board = new char[n][n];
        for (int i = 0; i < n; i++) {
             for (int j = 0; j <n; j++) {
                board[i][j] = '.';
            }
        }
       
        findSol(board,0,ans);
        return ans;
    }
    public static void findSol(char[][] board, int row,List<List<String>> ans){
        if (row == board.length) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : board) {
                solution.add(new String(rowArray));
            }
            ans.add(solution);
            return;
        }
        for(int i = 0; i < board.length; i++){
            if(isSafe(board,row,i)){
                board[row][i] = 'Q';
                findSol(board,row+1,ans);
                board[row][i] = '.';
            }
        }
    }
    public static boolean isSafe(char[][] board, int row,int col){
        for(int i = row; i >= 0 ; i--){
            if(board[i][col] == 'Q'){
               return false;
            }
        }
        for(int i = row, j = col; i>= 0 && j >= 0; i--,j--){
            if(board[i][j] == 'Q'){
               return false;
            }
        }
        for(int i = row, j = col; i>= 0 && j < board.length; i--,j++){
            if(board[i][j] == 'Q'){
               return false;
            }
        }
        return true;
    }   
}