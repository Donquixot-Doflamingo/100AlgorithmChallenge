function arrayMaximalAdjacentDifference(arr : number[]) : number{
    let maxDiff = Math.abs(arr[0] - arr[1]);

    for(let i = 0; i < arr.length; i++){
        let absoluteDiff = Math.abs(arr[i - 1] - arr[i]);
        maxDiff = absoluteDiff > maxDiff ? absoluteDiff : maxDiff;
    }

    return maxDiff;
}

console.log(arrayMaximalAdjacentDifference([1,2,4,1]));