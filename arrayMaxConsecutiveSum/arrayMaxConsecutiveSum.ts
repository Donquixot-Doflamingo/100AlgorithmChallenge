function arrayMaxConsecutiveSum(arr : number[], k : number) : number{
    let max = 0;
    let sum = 0;
        
    for (let i = 0; i < k; i++) {
        sum += arr[i];

    }
    max = sum;

    for(let i = k; i < arr.length; i++){
        sum -= arr[i - k];
        sum += arr[i];

        if(sum > max){
            max = sum;
        }
    }

    return max;
}

console.log(arrayMaxConsecutiveSum([2, 3, 5, 1, 6, 7, -1], 6));