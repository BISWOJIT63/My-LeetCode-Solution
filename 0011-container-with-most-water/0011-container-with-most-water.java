class Solution {
    public int maxArea(int[] height) {
        int maxWater = 0;
        int i = 0;
        int j = height.length-1;
        while(i < j){
            int boundry = Math.min(height[i],height[j]);
            int wl = boundry*(j-i);
            maxWater = Math.max(wl,maxWater);
            if(height[i] < height[j]){
                i++;
            }else{
                j--;
            }
        }
        return maxWater;
    }
}