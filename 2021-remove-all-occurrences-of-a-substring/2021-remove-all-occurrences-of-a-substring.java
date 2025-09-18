class Solution {
    public String removeOccurrences(String s, String part) {
        Stack<Character> stack = new Stack<>();
        int m = part.length();
        for(char ch : s.toCharArray()){
            stack.push(ch);
            if(stack.size() >= m){
                boolean isMatch = true;
                for(int i = 0; i < m; i++){
                    if(stack.get(stack.size()-m+i) != part.charAt(i)){
                        isMatch = false;
                        break;
                    }
                }
                if(isMatch){
                    for(int i = 0; i < m; i++ ){
                        stack.pop();
                    }
                }
            }          
        }
    StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}