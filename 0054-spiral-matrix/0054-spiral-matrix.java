class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        List<Integer> l = new ArrayList<>();
        int n = matrix[0].length;
        int sr = 0;
        int sc = 0;
        int er = m-1;
        int ec = n-1;
        while(sr <= er && sc <= ec){
            //right
            for(int i = sc; i <= ec ; i++){
                l.add(matrix[sr][i]);
            }
            sr++;
            //down
            for(int i = sr; i <= er; i++){
                l.add(matrix[i][ec]);
            }
            ec--;

            //left
            if(er >= sr){
                for(int i = ec; i >= sc; i--){
                l.add(matrix[er][i]);
            }
            er--;

            }
            
            //up
            if(ec >= sc ){
                for(int i = er; i >= sr; i--){
                    l.add(matrix[i][sc]);
                }
                sc++;
            }
        }
        return l;
    }
}