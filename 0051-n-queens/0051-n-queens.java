class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] board= new char[n][n]; 
        for(int i = 0; i <n ; i++){
           Arrays.fill(board[i],'.');
        }
        nQueen(0,board,n);
        return ans;
    }
        List<List<String>> ans = new ArrayList<>();
        private boolean isSafe(int row, int col,char[][] board,int n){
            // upperside 
            for(int i = row-1; i >= 0; i--){
                if(board[i][col]=='Q') return false;
            }
            //upper-left diagonal
            for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
                if(board[i][j]=='Q') return false;
            }

            //upper-right diagonal
             for(int i = row-1, j = col+1; i >= 0 && j < n; i--,j++){
                if(board[i][j]=='Q') return false;
            }
            return true;
        }

        private void nQueen(int row,char [][] board,int n){
            if(n == row){
               ans.add(arrayToList(board,n));
               return;
     }
            for(int i = 0; i < n; i++){
                if(isSafe(row,i,board,n)){
                    board[row][i] = 'Q';
                    nQueen(row+1,board,n);
                    board[row][i] = '.';
                }
            }
        }
        private List<String> arrayToList(char [][]board,int n)
        {
            List<String> temp = new ArrayList<>();
               for (int i = 0; i < n; i++) {
               temp.add(new String(board[i]));
            }
        return temp;
    }
}