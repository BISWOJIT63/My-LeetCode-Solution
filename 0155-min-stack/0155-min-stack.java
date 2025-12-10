class MinStack {
    Stack<Integer> st = new Stack<>();
    Stack<Integer> minSt = new Stack<>();
    public MinStack() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(minSt.isEmpty()){
            minSt.push(val);
        }else{
            minSt.push(Math.min(val,minSt.peek()));
        }
    }
    
    public void pop() {
        if(!st.isEmpty()) st.pop();
        if(!minSt.isEmpty()) minSt.pop();

    }
    
    public int top() {
        if(!st.isEmpty())
        return st.peek();
        else return -1;
    }
    
    public int getMin() {
        if(!minSt.isEmpty())
        return minSt.peek();
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