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
        if(board.length == row){ 
            ans.add(construct(board));
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
     public static List<String> construct(char[][] board) {
        List<String> list = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == '.') sb.append('.');
                else sb.append('Q');
            }
            list.add(sb.toString());
        }

        return list;
    }
    
}