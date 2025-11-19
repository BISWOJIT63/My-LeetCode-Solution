class Solution {
    public int[] sortArray(int[] nums) {
        int[] ans = new int[nums.length];
        mergeSort(nums,0,nums.length-1,ans);
        return nums;
    }
    public static void mergeSort(int[] nums, int si, int ei,int[] ans){
        if(si >= ei){
            return;
        }
        int mid = si+(ei-si)/2;
        mergeSort(nums,si,mid,ans);
        mergeSort(nums,mid+1,ei,ans);
        merge(nums,si,mid,ei,ans);
    }
    public static void merge(int[] nums, int si, int mid, int ei, int[] ans){
        int i = si;
        int j = mid+1;
        int k = si;
        while(i <= mid && j <= ei){
            if(nums[i] < nums[j]){
                ans[k++] = nums[i++];

            }else{
                ans[k++] = nums[j++];
            }
        }
        while(i <= mid){
            ans[k++] = nums[i++];
        }
        while(j <= ei ){
            ans[k++] = nums[j++];
        }
        for(int x = si; x <= ei; x++){
            nums[x] = ans[x];
        }
    }
}