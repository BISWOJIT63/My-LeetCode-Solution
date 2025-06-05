import java.util.*;
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int lp = 0;
        int maxLen = 0;
        for(int rp = 0; rp < n; rp++ ){ 
            //remove  until the duplicate character
            while(set.contains(s.charAt(rp))){
                set.remove(s.charAt(lp));
                lp++;
            }
            //after remove then add the char then continue the loop
            set.add(s.charAt(rp));
            maxLen = Math.max(maxLen,rp - lp +1);            
        }
        return maxLen;
    }
}