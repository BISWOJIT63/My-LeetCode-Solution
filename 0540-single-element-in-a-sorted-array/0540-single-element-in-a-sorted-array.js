/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
    if(nums.length === 1) return nums[0];
    let lp = 0;
    let rp = nums.length-1;

    while(lp < rp){
        if(nums[lp] === nums[lp+1] ){
            lp += 2;
        } else{
            return nums[lp];
        }
        if(nums[rp] === nums[rp-1] ){
            rp -= 2;
        } else{
            return nums[rp];
        }
    }
    return nums[lp];
};