class Solution {
    public int trap(int[] height) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for(int i = 0; i < height.length;i++){
            while(!st.isEmpty() && height[st.peek()] < height[i]){
                int pop_height = height[st.pop()];
                if(st.isEmpty()){
                    break;
                }
                int dis = i-st.peek()-1;
                int min_height = Math.min(height[i],height[st.peek()])-pop_height;
                res += min_height*dis;
            }
            st.push(i);
        }
    return res;
    }
}