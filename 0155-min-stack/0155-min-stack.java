class MinStack {
    Stack<int[]> st = new Stack<>();
    
    public void push(int val) {
        
        if(st.isEmpty()){
            st.push(new int[]{val,val});
        }else{
            int min = Math.min(val,getMin());
            st.push(new int[]{val,min});
        }
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek()[0];
        else return -1;
    }
    
    public int getMin() {
        if(!st.isEmpty())
        return st.peek()[1];
        else return -1;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */