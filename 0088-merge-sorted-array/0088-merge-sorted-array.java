class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = 0;
        int j = m;
            while(j < m+n){
                nums1[j] = nums2[i];
                i++;
                j++;
            }
        Arrays.sort(nums1);
    }
}