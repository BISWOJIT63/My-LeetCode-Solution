class Solution {
    public int trap(int[] arr) {
        int n = arr.length;
        int wl = 0;
        int left = 0, right = n-1;
        int lMax = 0, rMax = 0;

        while(left <= right){
            if(arr[left] < arr[right]){
                if(arr[left] < lMax){
                    wl += lMax-arr[left];
                    
                }else{
                    lMax = arr[left];
                    
                }
                left++;
            }else{
                if(arr[right] < rMax){
                    wl += rMax-arr[right];
                }else{
                    rMax = arr[right];
                }
                right--;
            }
        }
        return wl;
    }
}