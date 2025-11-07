class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int i = 0;
       while(i < s.length()){
        char cur = s.charAt(i);
        if(cur == '(' || cur == '{' || cur == '['){
            st.push(cur);
        }else{
            if(st.isEmpty()){
                return false;
            }
            char top = st.peek();
            if(cur == ')' && top == '(' || cur == '}' && top == '{' || cur == ']' && top == '[' ){
                st.pop();
            }else{
                 return false;
            }
        }
        i++;
       }       
        return st.isEmpty();
    }
}