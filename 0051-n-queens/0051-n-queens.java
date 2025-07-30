class Solution {
    public List<List<String>> solveNQueens(int n) {
        String[][] board= new String[n][n]; 
        for(int i = 0; i <n ; i++){
           Arrays.fill(board[i], ".");
        }
        nQueen(0,board,n);
        return ans;
    }
        List<List<String>> ans = new ArrayList<>();
        private boolean isSafe(int row, int col,String[][] board,int n){
            // upperside 
            for(int i = row-1; i >= 0; i--){
                if(board[i][col].equals("Q")) return false;
            }
            //upper-left diagonal
            for(int i = row-1, j = col-1; i >= 0 && j >= 0; i--,j--){
                if(board[i][j].equals("Q")) return false;
            }

            //upper-right diagonal
             for(int i = row-1, j = col+1; i >= 0 && j < n; i--,j++){
                if(board[i][j].equals("Q")) return false;
            }
            return true;
        }

        private void nQueen(int row,String [][] board,int n){
            if(n == row){
               ans.add(arrayToList(board,n));
               return;
     }
            for(int i = 0; i < n; i++){
                if(isSafe(row,i,board,n)){
                    board[row][i] = "Q";
                    nQueen(row+1,board,n);
                    board[row][i] = ".";
                }
            }
        }
        private List<String> arrayToList(String [][]board,int n)
        {
            List<String> temp = new ArrayList<>();
               for (int i = 0; i < n; i++) {
               StringBuilder sb = new StringBuilder();
               for (int j = 0; j < n; j++) {
               sb.append(board[i][j]);
            }
         temp.add(sb.toString());
        }
        return temp;
    }
}