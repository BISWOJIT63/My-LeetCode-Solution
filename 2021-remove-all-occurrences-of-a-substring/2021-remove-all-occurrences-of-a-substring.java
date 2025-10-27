class Solution {
    public String removeOccurrences(String s, String part) {
        int l1 = s.length();
        int l2 = part.length();
        StringBuilder sb = new StringBuilder();
        for(char c : s.toCharArray()){
            sb.append(c);
            if(sb.length() >= l2 && sb.substring(sb.length()-l2).equals(part)){
                sb.delete(sb.length()-l2,sb.length());
            }
        }
        return sb.toString();
    }
}