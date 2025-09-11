class Solution {
    public int[][] merge(int[][] intervals) {
       LinkedList <int[]> ans = new LinkedList<>();

        //sorting interval according to the 1st index
        Arrays.sort(intervals,(a,b)->(a[0]-b[0]));

        //check individual intervals and check condition
        for(int[] interval:intervals){
            if(ans.isEmpty() || ans.getLast()[1]<interval[0]){
                ans.add(interval);
            }else{
                ans.getLast()[1] = Math.max(interval[1],ans.getLast()[1]);
            }
        }
        return ans.toArray(new int[ans.size()][2]);
    }
}