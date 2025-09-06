class Solution {
    public int lengthOfLongestSubstring(String s) {
        int[] arr = new int[128];
        for(int i = 0 ; i < 128; i++){
            arr[i] = -1;
        }
        int left = 0;
        int maxLen = 0;
        for(int right = 0; right < s.length(); right++){
            char curChar = s.charAt(right);
            if(arr[curChar] >= left){
                left = arr[curChar]+1;
            }
            arr[curChar] = right;
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}