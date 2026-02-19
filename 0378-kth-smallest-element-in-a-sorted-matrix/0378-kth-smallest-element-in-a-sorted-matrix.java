class Solution {
    public int count(int[][] matrix, int mid) {
        int n = matrix.length;
        int col = 0;
        int row = n - 1;
        int c = 0;
        while (row >= 0 && col < n) {
            if (matrix[row][col] <= mid) {
                c += row + 1;
                col++;
            } else {
                row--;
            }
        }
        return c;
    }

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int l = matrix[0][0];
        int h = matrix[n-1][n-1];
        int ans = 0;
        while(l <= h){        
            int mid = l+(h-l)/2;
            if(count(matrix,mid) >= k){
                ans = mid;
                h = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
}