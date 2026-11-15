class Solution {
    public int maxIceCream(int[] costs, int coins) {
        int n = costs.length;
        int max = costs[0];
        for (int i = 1; i < n; i++) {
            if (max < costs[i])
                max = costs[i];
        }
        int count[] = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            count[i] = 0;
        }
        for (int i = 0; i < n; i++) {
            count[costs[i]]++;
        }
        int ans = 0;
        for (int i = 1; i < count.length ; i++) {
            
                
                int canBuy = Math.min(count[i], coins / i);
                
                ans += canBuy;
                coins -= canBuy * i;
                System.out.println(coins + " " + ans);
                if(coins <= 0){
                    break;
                }
            
        }
        return ans;
    }
}