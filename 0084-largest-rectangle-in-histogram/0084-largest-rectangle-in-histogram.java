class Solution {
    public int largestRectangleArea(int[] heights) {
        //find nextSmallerRight
        int[] nsr = nextSmallerRight(heights);
        //find nextSmallerLeft
        int[] nsl = nextSmallerLeft(heights);
        int[] area = new int[heights.length];
        print(nsr);
        print(nsl);
        for(int i = 0; i < heights.length; i++){
            int h = heights[i];
            int w = nsr[i]-nsl[i]-1;
            area[i] = h*w;
        }
        int maxArea = 0;
        for(int n : area){
            maxArea = Math.max(n,maxArea);
        }
        return maxArea;

    }
    public static void print(int[] nsr){
        for(int n : nsr){
            System.out.print(n+" ");
        }
         System.out.println();
    }
    public int[]  nextSmallerRight(int[] heights){
        int[] nsr = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i = 0; i < heights.length; i++){
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                nsr[s.pop()] = i;
            }
            s.push(i);
        }
        while(!s.isEmpty() ){
                nsr[s.pop()] = heights.length;
            }
        return nsr;
    }
    public int[]  nextSmallerLeft(int[] heights){
        int[] nsl = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length-1; i >= 0 ; i--){
            while(!s.isEmpty() && heights[i] < heights[s.peek()]){
                
                nsl[s.pop()] = i;
            }
            s.push(i);
        }
        while(!s.isEmpty() ){
                nsl[s.pop()] = -1;
            }
        return nsl;
    }
}