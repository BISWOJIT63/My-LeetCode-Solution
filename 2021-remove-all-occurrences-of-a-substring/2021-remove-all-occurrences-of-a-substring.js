/**
 * @param {string} s
 * @param {string} part
 * @return {string}
 */
var removeOccurrences = function(s, part) {
    if(s.length < part.length) return s;
   
    while(s.length > 0 && s.includes(part)){
        let index = s.indexOf(part);
        s = s.slice(0, index) + s.slice(index + part.length) 
    }
     return s;
};