/**
 * @param {number[]} nums
 * @return {number}
 */
var reversePairs = function(nums) {
    let ans = 0;
    function mergeSort(nums,si,ei){

    if(si >= ei) {
        return;
    }

    let mid =Math.floor(si+(ei-si)/2);


    mergeSort(nums,si,mid);
    mergeSort(nums,mid+1,ei);
    countPairs(nums, si, mid, ei);
    merge(nums,si,mid,ei);
   
}
   function countPairs(nums, si, mid, ei){
        let j = mid+1;
        for(let i = si; i <= mid;i++){
            while(j <= ei && nums[i]> 2*nums[j]){
                j++;
            }
            ans += j-(mid+1);
        }
 }

function merge(nums,si,mid,ei){
    let i = si;
    let j =mid+1;
    let arr = [];
    while(i <= mid && j <= ei){
        if(nums[i] < nums[j]){
           
           arr.push(nums[i]);
           i++;
        }else {
            arr.push(nums[j]);
            j++;
        }
    }
    while(i <=mid){
        arr.push(nums[i]);
        i++;
    }
     while(j <= ei){
        arr.push(nums[j]);
        j++;
    }
     for (let k = si; k <= ei; k++) {
            nums[k] = arr[k - si];
        }
  }
    mergeSort(nums,0,nums.length-1);
    return ans;
}