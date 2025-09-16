class Solution {
    
    public int reversePairs(int[] nums) {
        if(nums.length == 1) return 0;
        return mergeSort(nums,0,nums.length-1);
    }
    private int mergeSort(int[] nums, int start, int end){
        
        if(start >= end){
            return 0;
        }
        int mid = start+(end-start)/2;
        int count = mergeSort(nums,start,mid) + mergeSort(nums,mid+1,end);
        int j = mid+1;
        for(int i = start; i <= mid; i++){
            while(j <= end && nums[i] > 2L * nums[j] ){
                j++;
            }
            count += j-(mid+1);
        }
        merge(nums,start,mid,end);
        return count;

    }
    private void merge(int[] nums, int start, int mid, int end){
        int i = start, j = mid+1;
        int [] temp = new int[end-start+1];
        int k=0;
        while(i <= mid && j <= end){
            if(nums[i] >= nums[j]){
               temp[k++] = nums[j];
                j++;
            }else{
              temp[k++] = nums[i];
              i++;
            }

        }
        while(i <= mid){
            temp[k++] = nums[i];
            i++;
        }
        while(j <= end ){
             temp[k++] = nums[j];
             j++;
        }
        System.arraycopy(temp, 0, nums, start, temp.length);
    }
}