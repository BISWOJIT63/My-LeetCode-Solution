/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
    let result = [];
    function backTrack(start,total,current){
        if(total == target){
            result.push([...current]);
            return;
        }
        if(total > target ) return;

        for(let i = start; i < candidates.length; i++ ){
            current.push(candidates[i]);
            backTrack(i,total+candidates[i],current);
            current.pop();
        }
    }
    backTrack(0,0,[])
    return result;
};