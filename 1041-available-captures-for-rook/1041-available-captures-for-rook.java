class Solution {
    public int numRookCaptures(char[][] board) {
        int row = 0;
        int col = 0;
        for(int i = 0; i < 8; i ++){
            for(int j = 0; j < 8; j++){
                if(board[i][j] == 'R'){
                    row = i;
                    col = j;
                    break;
                }
            }
        }
        int count = 0;
        //up
        int i = row-1;
        while(i >= 0){
            if(board[i][col] == '.'){
                i--;
            }
            else if(board[i][col] == 'p'){
                count++;
                break;
            }
            else{
                break;
            }
        }
        //right
        int j = col+1;
        while(j < 8){
            if(board[row][j] == '.'){
                j++;
            }
            else if(board[row][j] == 'p'){
                count++;
                break;
            }
            else{
                break;
            }
        }
        //down
        i = row+1;
        while(i < 8){
            if(board[i][col] == '.'){
                i++;
            }
            else if(board[i][col] == 'p'){
                count++;
                break;
            }
            else{
                break;
            }
        }
        //left
        j = col-1;
        while(j >= 0){
            if(board[row][j] == '.'){
                j--;
            }
            else if(board[row][j] == 'p'){
                count++;
                break;
            }
            else{
                break;
            }
        }
        return count;
    }
}