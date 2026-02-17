class Solution {
    public void heapify(int[] nums, int i, int n){
        int left = 2*i+1;
        int right = 2*i+2;
        int max = i;
        if(left < n && nums[left] > nums[max]){
            max = left;
        }
         if(right < n && nums[right] > nums[max]){
            max = right;
        }
        if(i != max){
            int temp = nums[i];
            nums[i] = nums[max];
            nums[max] = temp;
            heapify(nums,max,n);
        }
    }
    public int[] sortArray(int[] nums) {
        int n = nums.length;
        for(int i = n/2; i >= 0; i--){
            heapify(nums,i,n);
        }
        for(int i = n-1; i >= 1 ;i--){
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;
            heapify(nums,0,i);
        }
        return nums;
    }
}