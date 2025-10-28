class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int si = 0;
        int ei = arr.length-1;
        while(si <= ei){
            int mid = si+(ei-si)/2;
            if(arr[mid] >= arr[mid+1] && arr[mid] >= arr[mid-1]){
                return mid;
            }else if( arr[mid] < arr[mid+1]){
                si = mid+1;
            }else {
                ei = mid-1;
            }
        }
        return -1;
    }
}