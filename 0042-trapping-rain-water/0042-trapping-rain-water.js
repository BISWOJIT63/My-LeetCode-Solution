/**
 * @param {number[]} height
 * @return {number}
 */
var trap = function(height) {
    let lp = 0;
    let rp = height.length-1;
    let lm = 0;
    let rm =0;
    let twl = 0;
    while(lp < rp){
        if(height[lp] < height[rp]){
            lm = Math.max(lm,height[lp]);
            twl += lm- height[lp];
            lp++;
        }else{
            rm = Math.max(rm,height[rp]);
            twl += rm- height[rp];
            rp--;
        }
    }
    return twl;
};