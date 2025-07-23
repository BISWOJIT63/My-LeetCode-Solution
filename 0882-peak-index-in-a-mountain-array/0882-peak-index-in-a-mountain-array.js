/**
 * @param {number[]} arr
 * @return {number}
 */
var peakIndexInMountainArray = function(arr) {
    let lp = 0;
    let rp = arr.length-1;
    while(lp < rp){
        if(arr[lp] < arr[rp]){
            lp++;
        }else{
            rp--;
        }
    }
    return rp;
};