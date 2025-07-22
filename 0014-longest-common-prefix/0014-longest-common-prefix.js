/**
 * @param {string[]} strs
 * @return {string}
 */
var longestCommonPrefix = function(strs) {
    if(strs.lengtgh === 0 ){
        return "";
    }
    let prefix = "";
    let first = strs[0];
    for(let i= 0; i < first.length; i++){
        let char = first[i];
        for(let j = 1; j < strs.length; j++){
            if(i > strs[j].length || strs[j][i] !== char){
                return prefix;
            }
        }
        prefix += char;
    }
    return prefix;
};