class Solution {
    public class Points implements Comparable<Points>{
        int x,y,dist,idx;
        public Points (int x, int y, int dist,int idx){
            this.x = x;
            this.y = y;
            this.dist = dist;
            this.idx = idx;
        }

        public int compareTo(Points p2){
            return this.dist - p2.dist;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Points> pq = new PriorityQueue<>();
        int[][] ans = new int[k][2];
        for(int i = 0; i < points.length; i++) {
            int dist = points[i][0]*points[i][0]+points[i][1]*points[i][1];
            pq.add(new Points(points[i][0],points[i][1],dist,i));
        }
        for(int i = 0; i < k; i++){
            ans[i] = points[pq.poll().idx];
        }
        return ans;
    }
}