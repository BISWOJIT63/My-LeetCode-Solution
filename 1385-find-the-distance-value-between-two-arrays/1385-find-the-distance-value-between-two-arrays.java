class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int t  = 0;
        for(int i = 0; i < arr1.length;i++){
            for(int j = 0; j < arr2.length;j++){
                int n = Math.abs(arr1[i]-arr2[j]);
                if(n <= d){
                    t++;
                    break;
                }
            }
        }
        return arr1.length-t;        
    }
}