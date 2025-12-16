class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0|| s.length() == 1) return s.length();
        int count = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            while(!st.isEmpty() && s.charAt(i) == ')' && st.peek() == '(') {
                st.pop();
                count--;
            }
            if(s.charAt(i) == '(') st.push('('); 
            else count++;
        }
        return st.size()+count;
    }
}