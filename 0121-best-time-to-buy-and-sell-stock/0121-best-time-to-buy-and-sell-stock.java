class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int maxProfit = 0;
        int buyPrice = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++){
            if(buyPrice < prices[i]){
                maxProfit = Math.max(prices[i]-buyPrice,maxProfit);
            }else{
                buyPrice = prices[i];
            }
        }
     return maxProfit;
    }
}