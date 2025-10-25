class Solution {
    public int reversePairs(int[] nums) {
        if(nums.length <= 1){
            return 0;
        }
        return mergeSort(nums,0,nums.length-1);
    }
    public static int mergeSort(int[] arr, int si, int ei){
        if(si >= ei){
            return 0;
        }
        int count = 0;
        int mid = si+(ei-si)/2;
        count += mergeSort(arr,si,mid);
        count += mergeSort(arr,mid+1,ei);
        count += merge(arr,si,mid,ei);
        return count;
    }
    public static int merge(int[] arr,int si, int mid,int ei){
        int r = mid+1;
        int count = 0;
        for(int i = si; i <= mid; i++){
            while(r <= ei && (long)arr[i] > 2L*arr[r]){
                r++;
            }
            count += r-(mid+1);
        }
        int n1 = mid - si +1;
        int n2 = ei - mid;
        int[] L = new int[n1];
        int[] R = new int[n2];
        for(int i = 0; i < n1; i++){
            L[i] =arr[si+i];
        }
        for(int i = 0; i < n2; i++){
            R[i] = arr[mid+1+i];
        }
        int i = 0;
        int j = 0;
        int k = si;
        while(i < n1 && j < n2){
            if(L[i] <= R[j]){
                arr[k] = L[i]; 
                i++;
            }else{
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while(i < n1){
            arr[k] = L[i];
            k++;
            i++;
        }
        while(j < n2){
            arr[k] = R[j];
            j++;
            k++;
        }
        return count;
    }
}