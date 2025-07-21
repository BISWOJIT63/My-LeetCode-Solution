/**
 * @param {character[]} chars
 * @return {number}
 */
var compress = function(chars) {
   let i = 0; // it iterate the whole string
   let write = 0;//track the index where we store the string ans
   while(i < chars.length){
    let curChar = chars[i];
    let count = 0;
    while(i < chars.length && chars[i] === curChar){
        count++;
        i++;
    }
    chars[write] = curChar;
    write++;
    if(count > 1){
        for(let ch of count.toString()){
            chars[write] =ch;
            write++;
        }
    }
   }
   return write;
};