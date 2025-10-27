class Solution {
    public String removeOccurrences(String s, String part) {
        int l1 = s.length();
        int l2 = part.length();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < l1;i++){
            st.push(s.charAt(i));
            if(st.size() >= l2){
                boolean match = true;
                for(int k = 0; k < l2; k++ ){
                    if(st.get(st.size()-l2+k) != part.charAt(k)){
                        match = false;
                        break;
                    }
                }
                if(match){
                    for(int k = 0; k < l2; k++){
                        st.pop();
                    }
                }
            }
            
        }
        StringBuilder sb = new StringBuilder();
        for(char c : st){
            sb.append(c);
        }
        return sb.toString();
    }
}