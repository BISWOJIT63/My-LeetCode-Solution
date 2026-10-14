class Solution {
    public boolean isValid(String s) {
         if (s.length() % 2 != 0) return false;
        Stack<Character> st = new Stack<>();
        for(int i = 0 ; i < s.length();i++){
            char p = s.charAt(i);
            if(p == '(' || p == '{' || p == '['){
                st.push(p);
            }else{
                if(st.isEmpty()) return false;
                if(p==')'&&st.pop()!='(') return false;
                if(p==']'&&st.pop()!='[') return false;
                if(p=='}'&&st.pop()!='{') return false;
            }
        }
        return st.isEmpty();
    }
}