class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0;
        for(int right = 0; right < s.length(); right++){
            char curChar = s.charAt(right);

            while(set.contains(curChar)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(curChar);
            maxLength = Math.max(maxLength,right-left+1);
        }
        return maxLength;
    }
}