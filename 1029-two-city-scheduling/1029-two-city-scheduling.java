class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int n = costs.length;
        //sort the array basis of profit the 1st half for 
        Arrays.sort(costs,(a,b)->{
            
            int profitA = a[1]-a[0];
            int profitB = b[1]-b[0];

            if(profitA > profitB ) return -1;
            else if(profitA < profitB ) return +1;
            else return 0;
        });
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