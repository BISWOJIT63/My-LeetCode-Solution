class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sa = s.toCharArray();
        char[] ta = t.toCharArray();
        Arrays.sort(sa);
        Arrays.sort(ta);
        s = Arrays.toString(sa);
        t = Arrays.toString(ta);
        System.out.println(sa + "   "+ta);
        return s.equals(t);
    }
}