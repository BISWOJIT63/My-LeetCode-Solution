class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length-1;
        int maxArea = 0;
        while(left < right){
            int curHeight = height[left]<height[right]?height[left]:height[right];
            int curArea =curHeight*(right-left);
            if(maxArea < curArea){
                maxArea = curArea;
            }
            while(left < right && height[left]<=curHeight){
                left++;
            }
            while(left < right && height[right]<=curHeight){
                right--;
            }
        }
        return maxArea;
    }
}