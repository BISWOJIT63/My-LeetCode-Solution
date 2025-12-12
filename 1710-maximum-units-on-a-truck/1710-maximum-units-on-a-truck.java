class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1]));
        
        int maxUnit = 0;
        for(int i = 0; i < boxTypes.length; i++){
            if(truckSize >= boxTypes[i][0]){
                truckSize -= boxTypes[i][0];
                maxUnit += boxTypes[i][1]*boxTypes[i][0];
            }else{
                maxUnit += boxTypes[i][1]*truckSize;
                return maxUnit;
            }
        }
        return maxUnit;
    }
}