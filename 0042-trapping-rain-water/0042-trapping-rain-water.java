class Solution {
    public int trap(int[] height) {
        int n = height.length;
        int [] maxL = new int[n];
        maxL[0] = height[0];
        int []maxR = new int[n];
        maxR[n-1] = height[n-1];
        int res = 0;
        for(int i = 1; i < n; i++){
            maxL[i] = Math.max(maxL[i-1],height[i]);
        }
        for(int i = n-2; i >= 0 ; i--){
            maxR[i] = Math.max(maxR[i+1],height[i]);
        }
        for(int i = 0; i < n; i++){
            int tw = Math.min(maxL[i],maxR[i])-height[i];
            res += tw;
        }
        return res;
    }
}