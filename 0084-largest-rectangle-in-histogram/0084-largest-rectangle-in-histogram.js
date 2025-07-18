/**
 * @param {number[]} heights
 * @return {number}
 */
var largestRectangleArea = function(heights) {
    let nseL = [];
    let nseR = [];


    //next smaller elements from right side and store the indeces of the elements
    let stack = [];

    for(let i = heights.length-1; i>=0;i--){
        while(stack.length > 0 && heights[i] <= heights[stack[stack.length - 1]]){
            stack.pop();
        }
        if(stack.length === 0){
           nseR[i] = heights.length
        }else{
             nseR[i] = stack[stack.length-1];
        }
        stack.push(i);
    }

    //next smaller elements from left side and store the indeces of the elements
    stack = [];
    
    for(let i = 0; i < heights.length ;i++){
        while(stack.length > 0 && heights[i] <= heights[stack[stack.length - 1]]){
            stack.pop();
        }
        if(stack.length === 0){
           nseL[i] = -1;
        }else{
             nseL[i] = stack[stack.length-1];
        }
        stack.push(i);
    }

    //then find the area
    let maxArea = 0;

    for(let i = 0; i < heights.length; i++ ){
        let j = i;
        let width = nseR[j]-nseL[i]-1 //here -1 due to we dont includes that bar only includes the middle bars for width

        let curArea = heights[i]*width;
        maxArea = Math.max(maxArea, curArea);
    }
    return maxArea;
};