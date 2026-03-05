class Solution {
    public boolean checkIfPangram(String s) {
        if(s.length() < 26) return false;
        int [] arr= new int[26];
        int c = 0;
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            int idx = ch - 'a';
            if(arr[idx] == 0){
                arr[idx]++;
                c++;
            }
        }
        if(c == 26) return true;
        return false;
    }
}