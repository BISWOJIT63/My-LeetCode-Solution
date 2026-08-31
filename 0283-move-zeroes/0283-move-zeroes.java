class Solution {
    public void moveZeroes(int[] nums) {
        if (nums.length == 1)
            return ;
        int zeros = 0;
        int others = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                others++;
            } else {
                zeros++;
            }
        }
        int a1[] = new int[zeros];
        int a = 0;
        int a2[] = new int[others];
        int b = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                a1[a++] = nums[i];
            } else {
                a2[b++] = nums[i];
            }
        }
        int i = 0;
        for ( ; i < a2.length; i++) {
            nums[i] = a2[i];
        }
        for (int j =0 ; j < a1.length; j++) {
            nums[i] = a1[j];
            i++;
        }
    }
}