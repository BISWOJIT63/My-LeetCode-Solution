class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLen= 0;
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 0;
        while(j < n){
            char curChar = s.charAt(j);
            if( set.contains(curChar)){
                set.remove(s.charAt(i));
                i++;
            }else{
                set.add(curChar);
                maxLen = Math.max(maxLen,j-i+1);
                j++;
            }

        }
        return maxLen;
    }
}