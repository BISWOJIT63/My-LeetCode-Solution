class Solution {
    public int findMinArrowShots(int[][] points) {
        int n = points.length;
        if(n == 0 || n == 1) return n;
        Arrays.sort(points,(a,b)->a[1]-b[1]);
        int count = 1;
        int endPoint = points[0][1];
        for(int i = 1; i < n ; i++){
            if(endPoint < points[i][0]){
                count++;
                endPoint = points[i][1];
            }else{
                continue;
            }
        }
        return count;
    }
}