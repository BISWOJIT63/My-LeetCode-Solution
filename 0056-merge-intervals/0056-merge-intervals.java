class Solution {
    public int[][] merge(int[][] intervals) {

        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));//sort the array
        List<int[]> res = new ArrayList<>();
        //if there is only one interval then it return only that interval
        if(n == 1) return intervals;
        //check the overlap condition
        //by iterating all elements 
        for(int[] interval : intervals){
            if(res.size() == 0) res.add(interval);
            else{
                int[] prevInterval = res.get(res.size()-1);
                if(prevInterval[1] >= interval[0]){
                    prevInterval[1] = Math.max(prevInterval[1],interval[1]);
                }
                else{
                    res.add(interval);
                }
            }            
        }
        return res.toArray(new int[res.size()][]) ;
    }
}