class Solution {
    public boolean checkString(String s) {
        if(s.length() == 1) return true;
        
        for(int i = 0; i < s.length()-1; i++){
            if(s.charAt(i) > s.charAt(i+1)){
                return false;
            }
        }
        return true;
    }
}