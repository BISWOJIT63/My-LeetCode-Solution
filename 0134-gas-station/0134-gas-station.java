class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
       
        int tank = 0;
        int fuelUsage = 0;
        int st = 0;
        for(int i = 0; i < gas.length; i++){
            tank += gas[i]-cost[i];
            fuelUsage += gas[i]-cost[i];
            if(fuelUsage < 0){
                fuelUsage = 0;
                st = i+1;
            }
        }
        return (tank < 0)?-1:st;
    }
}