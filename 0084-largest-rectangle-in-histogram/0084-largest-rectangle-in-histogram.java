class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st = new Stack<>();
        int max = 0;
        for(int i = 0; i < heights.length; i++){
            while(!st.isEmpty() && heights[st.peek()] > heights[i]){
                int idx = st.pop();
                int pse = st.isEmpty() ? -1 : st.peek();
                max= Math.max(heights[idx]*(i-(pse)-1),max);
            }
            st.push(i);
        }
        while(!st.isEmpty()){
            int idx = st.pop();
            int pse = st.isEmpty() ? -1 : st.peek();
            int nse = heights.length;
            max= Math.max(heights[idx]*(nse-(pse)-1),max);
        }
        return max;
    }
}