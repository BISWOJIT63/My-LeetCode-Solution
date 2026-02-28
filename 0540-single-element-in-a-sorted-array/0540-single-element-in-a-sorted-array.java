class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        //edge cases
        if (n == 1)
            return nums[0];// if there is only 1 element

        if (nums[0] != nums[1])
            return nums[0]; // check the 1st is unique

        if (nums[n - 1] != nums[n - 2])
            return nums[n - 1];// check the last was unique

        //we alredy check for 1st and last so we exclude the index 1st and last
        int st = 1;
        int end = n - 2;
        while (st <= end) {
            int mid = st + (end - st) / 2;
            //check the mid element is unique
            if (nums[mid] != nums[mid - 1] && nums[mid] != nums[mid + 1]) { 
                return nums[mid];
            }
            //check the unique element is in right side  
            else if ((mid % 2 == 1 && nums[mid] == nums[mid - 1])||
                    (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                st = mid + 1;
            } 
            //if not then it is in left side
            else {
                end = mid - 1;
            }
        }
        return -1;// if there is no unique element
    }
}