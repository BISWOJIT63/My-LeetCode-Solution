/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    const sortedString1 = s.split('').sort().join('');
    const sortedString2 = t.split('').sort().join('');
    if(sortedString1 === sortedString2){
        return true;
    }
    return false;
};