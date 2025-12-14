class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        //sort the array basis of profit the 1st half for 
        Arrays.sort(costs, (a, b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int maxProfit = 0;
        for(int i = 0; i < n/2; i++){
            maxProfit += costs[i][0];
            System.out.println(costs[i][0]);
        }
        for(int i = n/2; i < n; i++){
            maxProfit += costs[i][1];
            System.out.println(costs[i][1]);
        }
        return maxProfit;
    }
}