class Solution {
    public int minAddToMakeValid(String s) {
        if(s.length() == 0|| s.length() == 1) return s.length();
        
        int open = 0;
        int add = 0;
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(') {
                open++;
            }
            else {
                if(open > 0) open--;
                else add++;
            }
        }
        return add+open;
    }
}