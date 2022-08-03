function arrayConversion(num : number[]) : number{
    let isOdd = true;

    while(num.length !== 1){
        
        num = sumProduct(num, isOdd);

        isOdd = !isOdd;

    }

    return num[0];
}

function sumProduct(num : number[], isOdd : boolean) : number[]{
    const sumProduct : number[] = [];

    if(isOdd){
        for(let i = 0; i < num.length; i += 2){
            sumProduct.push(num[i] + num[i+1]);
        }
    }
    else{
        for(let i = 0; i < num.length; i += 2){
            sumProduct.push(num[i] * num[i+1]);
        }
    }

    return sumProduct;
}

console.log(arrayConversion([1,2,3,4,5,6,7,8]));