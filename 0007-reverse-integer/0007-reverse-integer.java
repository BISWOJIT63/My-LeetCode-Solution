class Solution {
    public int reverse(int x) {
        boolean sign = false;
        int rev = 0;
        if (x < 0) {
            sign = true;
            x = -(x);
        }
        while (x > 0) {
            int rem = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10 ) {
                return 0;
            }
            rev = rev * 10 + rem;
            x = x / 10;
        }
        if (sign)
            rev = -(rev);
        
        return rev;

    }
}