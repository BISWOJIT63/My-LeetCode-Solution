class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        List<Integer> spiralMatrix = new ArrayList<>();
        int top = 0;
        int down = m-1;
        int right = n-1;
        int left = 0;

        while(top <= down && left <= right ){
            for(int i = left; i <= right ; i++){
                spiralMatrix.add(matrix[top][i]);
            }
            top++;
            for(int i = top; i <= down ; i++){
                spiralMatrix.add(matrix[i][right]);
            }
            right--;
            if(top <= down){
                for(int i = right; i >= left ; i--){
                spiralMatrix.add(matrix[down][i]);
             }
            }
            down--;
            if(left <= right){
                for(int i = down; i >= top ; i--){
                spiralMatrix.add(matrix[i][left]);
                }
            }
            left++;
            
        }
        return  spiralMatrix;
    }
}