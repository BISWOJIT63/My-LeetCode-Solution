/**
 * @param {string} s
 * @return {string[][]}
 */
var partition = function(s) {
    let n= s.length
    let ans = [];
    function isPalindrome(str, left, right) {
        while (left < right) {
            if (str[left++] !== str[right--]) return false;
        }
        return true;
    }
     function backTrack(start,subS){
        if(start == n){
            ans.push([...subS]);
            return;
        }
        
        for(let i =start; i < n; i++){
        //check valid or not for next
            if(isPalindrome(s, start, i)){
            subS.push(s.slice(start, i+1));
            backTrack(i+1,subS);
            subS.pop();
            }
        }
     }
     backTrack(0,[]);
     return ans;
};