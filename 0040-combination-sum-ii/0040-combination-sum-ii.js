/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
    candidates.sort((a,b)=>a-b);
    let result = [];
    function backTrack(start,total,current){
        if(total == target){
            result.push([...current]);
            return;
        }
        if(total > target ) return;

        for(let i = start; i < candidates.length; i++ ){
              if (i > start && candidates[i] === candidates[i - 1])
              continue;
            current.push(candidates[i]);
            backTrack(i+1,total+candidates[i],current);
            current.pop();
        }
    }
    backTrack(0,0,[])
    return result;
};