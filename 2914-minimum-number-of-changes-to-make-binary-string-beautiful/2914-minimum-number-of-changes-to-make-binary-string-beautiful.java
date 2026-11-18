class Solution {
    public int minChanges(String s) {
       char prev = s.charAt(0);
       int count = 0;
       for(int i = 1; i < s.length(); i+=2){
        if(s.charAt(i) != prev) count++;
        if(i+1 >= s.length()) break;
        prev = s.charAt(i+1);
       }
       return count;
    }
}