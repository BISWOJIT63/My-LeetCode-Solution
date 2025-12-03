class Solution {
    public String decodeString(String s) {
        Stack<Character> st = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch != ']'){
                st.push(ch);
            }else{
                //make a string to reapeat
                StringBuilder sb = new StringBuilder();
                while(st.size()>0 && st.peek() != '['){
                    sb.insert(0,st.pop());
                }
                st.pop();
                String repeatString = sb.toString();
                
                //make the number howmany times repeat
                sb = new StringBuilder();
                while(st.size()>0 && st.peek() >='0' & st.peek() <= '9'){
                    sb.insert(0,st.pop());
                }
                int count = Integer.parseInt(sb.toString());
                 
                //repeat the string count times and push for next 
                while(count -- > 0){
                    for(int j = 0; j < repeatString.length();j++){
                        char rChar = repeatString.charAt(j);
                        st.push(rChar);
                    }
                }
            }
        }
        StringBuilder ans = new StringBuilder();
        while(st.size() > 0){
            ans.append(st.pop());
        }
        ans.reverse();
        return ans.toString();
    }
}