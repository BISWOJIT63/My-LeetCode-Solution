class Solution {
    public int minCost(String colors, int[] nTime) {
        int n = colors.length();
        if(n <= 1){
            return 0;
        }
        int time = 0;
        int i = 1;
        char prev = colors.charAt(0);
        int prevIdx = 0;
        while(i < n){
            
            while(i < n && prev == colors.charAt(i) ){
                if(nTime[prevIdx] < nTime[i]){
                    time += nTime[prevIdx];
                    prev = colors.charAt(i);
                    prevIdx = i;
                    i++;
                }else{
                    time += nTime[i];
                    i++;
                }
            }
            if(i < n) {
                prev = colors.charAt(i);
                prevIdx = i;
            }
            i++;
        }
        return time;
    }
}