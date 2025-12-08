class Solution {
    public int firstUniqChar(String s) {
        Queue<Character> q = new LinkedList<>();
        int[] freq = new int[26];
        for(int i = 0; i < 26; i++){
            freq[i] = 0;
        }
        for(int i = 0; i < s.length();i++){
            char ch = s.charAt(i);
            q.add(ch);
            freq[ch-'a']++;
        }
        int i = 0;
        while(!q.isEmpty() && freq[q.peek()-'a'] > 1){
                q.remove();
                i++;
            }
        if(!q.isEmpty()) return i;
        return -1;
    }
}