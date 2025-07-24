/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number}
 */
var findMedianSortedArrays = function(nums1, nums2) {
    let i= 0;
    let j = 0;
    let mergedArray = [];
    while(i < nums1.length && j < nums2.length){
        if(nums1[i] > nums2[j] ){
            mergedArray.push(nums2[j])
            j++;
        }else{
           mergedArray.push(nums1[i])
            i++; 
        }
    }
    while(i < nums1.length){
        mergedArray.push(nums1[i])
        i++;
    }
    while(j < nums2.length){
        mergedArray.push(nums2[j])
        j++;
    }
    if(mergedArray.length % 2 !== 0){
        let idx = Math.floor(mergedArray.length/2);
        return mergedArray[idx];
    }else{
        let idx1 = Math.floor(mergedArray.length/2);
        let idx2 = Math.floor(mergedArray.length/2) -1;
        return (mergedArray[idx1]+mergedArray[idx2])/2;
    }
};