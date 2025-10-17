class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int curHeight = Math.min(height[i],height[j]);
            int wl = curHeight*(j-i);
            maxWater = Math.max(wl,maxWater);
            while(i < j && height[i] <= curHeight){
                i++;
            }
            while(i < j && height[j] <= curHeight){
                j--;
            }
        }
        return maxWater;
    }
}