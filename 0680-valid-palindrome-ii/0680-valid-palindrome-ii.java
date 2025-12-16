class Solution {
    public boolean validPalindrome(String s) {
        int n = s.length();
        int i = 0;
        int j = n-1;
        while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                break;
            }
        }
        if(i < j){
            if(isPalindrome(i+1,j,s) || isPalindrome(i,j-1,s)) return true;
            else return false;
        }
        return true;
    }
    static boolean isPalindrome(int i, int j, String s){
       while(i <= j){
            if(s.charAt(i) == s.charAt(j)){
                i++;
                j--;
            }else{
                return false;
            }
        }
        return true;
    }
}