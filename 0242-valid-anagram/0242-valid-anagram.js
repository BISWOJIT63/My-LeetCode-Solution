/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isAnagram = function(s, t) {
    if(s.length != t.length) return false;
    const sortedString1 = s.split('').sort().join('');
    const sortedString2 = t.split('').sort().join('');
    
    return sortedString1 === sortedString2;
};