function numayChange(num : number[]) : number{
    let count = 0;

    for( let i = 0; i < num.length; i++){
        if(num[i] >= num[i+1]){
            count += num[i] - num[i+1] + 1;
            num[i+1] += num[i] - num[i+1] + 1;
        }
    }
    return count;
}
console.log(numayChange([1,1,1]));