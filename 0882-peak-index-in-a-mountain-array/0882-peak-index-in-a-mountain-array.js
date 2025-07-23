/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function(arr) {
    let lp = 0;
    let rp = arr.length-1;
    while(lp < rp){
       let mid = lp+Math.floor((rp-lp)/2);
        if(arr[mid] < arr[mid+1]){
            lp = mid+1;
        }else{
            rp=mid;
        }
    }
    return rp;
};