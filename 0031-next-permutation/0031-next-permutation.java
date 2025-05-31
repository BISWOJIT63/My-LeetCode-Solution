class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int idx = -1;
        // find the break point 
        for(int i =n-2; i >= 0; i-- ){
            if(nums[i] < nums[i+1]){
                idx = i;
                break;
            }
        } 
        // if the permutaion is last then the next permutation is the first permutation
            if(idx == -1){
                idx = 0;
                int i = n-1;
                while(i > idx){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                idx++;
                i--;
           }
        }

        // then find the just smallest element than idx value
       else{
         for(int i = n-1; i > idx; i--){
            if(nums[idx] < nums[i]){
                int temp = nums[i];
                nums[i] = nums[idx];
                nums[idx] = temp;
                break;
            }
        }
        idx = idx+1;
        // then reverse the remaining elements
        for(int i = n-1; i > idx ; i--){
            int temp = nums[i];
            nums[i] = nums[idx];
            nums[idx] = temp;
            idx++;
        }
       }
        
    }
}