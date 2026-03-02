class Solution {
    public int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length-1;
        
        while(low <= high){
            if(nums[low] == target) return low;
            if(nums[high] == target) return high;
            int mid = low+(high-low)/2;
            if(nums[mid] == target) return mid; // check the target is mid 

            //if left half is sorted
            if(nums[low] <= nums[mid]){
                //check taget exist in the left part
                if(nums[low] <= target && target < nums[mid]){
                    high = mid-1;
                }
                //if not exist check in right side
                else{
                    low = mid+1;
                }
            }
            //if right half sorted
            else{
                //check target exist in right half
                if(nums[mid] < target && target <= nums[high]){
                    low = mid+1;
                }else{ // check in left half
                    high = mid-1;
                }
            }
        }
        return -1; // if target is not exist 
    }
}