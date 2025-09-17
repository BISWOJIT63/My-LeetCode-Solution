class Solution {
    public boolean isPalindrome(String s) {
        String newS = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int i = 0;
        int j = newS.length()-1;
        while(i <= j){
            if(newS.charAt(i) != newS.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}