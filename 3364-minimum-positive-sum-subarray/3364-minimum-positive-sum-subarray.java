class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        int n = nums.size();
        int min = Math.min(l, r);
        if (l == 1 || r == 1) {
            for (int i = 0; i < n; i++) {
                if (nums.get(i) > 0) {
                    ans = Math.min(ans, nums.get(i));
                }
            }
        }
        if (n == min) {
            int sum = 0;
            for (int i = 0; i < n; i++) {
                sum += nums.get(i);
            }
            if (sum > 0) {
                ans = Math.min(sum, ans);
            }
        } else {
            for (int i = 0; i <= n - min; i++) {
                int sum = nums.get(i);
                int j = i + 1;
                while (j < n && j < i + l) {
                    sum += nums.get(j);
                    
                    j++;
                }
                if (sum > 0) {
                        ans = Math.min(sum, ans);
                    }
                if (l != r) {
                    while (j < n && j < i + r) {
                        sum += nums.get(j);
                        if (sum > 0) {
                            ans = Math.min(sum, ans);
                        }
                        j++;
                    }

                }
            }
        }

        if (ans == Integer.MAX_VALUE)
            return -1;
        return ans;
    }
}