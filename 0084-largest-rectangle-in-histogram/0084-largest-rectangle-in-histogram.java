class Solution {
    public int largestRectangleArea(int[] heights) {
        //find nextSmallerRight
        int[] nsr = new int[heights.length];
        Stack<Integer> s = new Stack<>();
        for(int i = heights.length-1; i >=0 ; i--){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                s.pop();
            }
            if(s.isEmpty() ){
                nsr[i] = heights.length;
            }else{
                nsr[i] = s.peek();
            }
            s.push(i);
        }        
        //find nextSmallerLeft
        int[] nsl = new int[heights.length];
        s = new Stack<>();
        for(int i = 0; i < heights.length ; i++){
            while(!s.isEmpty() && heights[i] <= heights[s.peek()]){
                
                s.pop() ;
            }
            if(s.isEmpty()){
                nsl[i] =-1 ;
            }else{
                nsl[i] =s.peek() ;
            }
            s.push(i);
        }
        print(nsr);
        print(nsl);
        int[] area = new int[heights.length];
        int maxArea = 0;
        for(int i = 0; i < heights.length; i++){
            int h = heights[i];
            int w = nsr[i]-nsl[i]-1;
            area[i] = h*w;
            maxArea = Math.max(area[i],maxArea);
        }
        return maxArea;
    }
    public static void print(int[] arr){
        for(int n: arr){
            System.out.print(n+" ");
        }
        System.out.println();        
    }
}
