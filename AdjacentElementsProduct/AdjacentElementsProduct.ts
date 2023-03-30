function AdjacentElementsProduct(inputArray : number[]) : number{
    if(inputArray.length == 0) return -1;

    if(inputArray.length == 1) return inputArray[0];

    let largest = inputArray[0] * inputArray[1];

    for(let i = 1; i < inputArray.length - 1; i++){

        const product = inputArray[i] * inputArray[i+1];

        console.log(product);

        largest = largest < product ? product : largest;
    }

    return largest;
}

console.log(AdjacentElementsProduct([11,23]))