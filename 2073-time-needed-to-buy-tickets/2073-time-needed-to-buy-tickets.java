class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int res = 0;
        for(int i = 0; i < tickets.length; i++){
            int curr = tickets[i];
            if(i <= k){
                res += Math.min(curr,tickets[k]);
            }else{
                res += Math.min(curr,tickets[k]-1);
            }
        }
        return res;
    }
}