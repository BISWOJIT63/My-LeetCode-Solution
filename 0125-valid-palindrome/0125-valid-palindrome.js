/**
 * @param {string} s
 * @return {boolean}
 */
var isPalindrome = function(s) {
    let filteredString = s.replace(/[^a-z0-9]/gi, "").toLowerCase();
    
    let lp = 0;
    let rp = filteredString.length-1;
    while(lp <= rp){
        if(filteredString[lp] != filteredString[rp]){
            return false;
        }
        lp++;
        rp--;
    }
    return true;
};