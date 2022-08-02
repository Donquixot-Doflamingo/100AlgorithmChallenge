function AlternatingSums(a:number[]) : number[]{
    let evenSum = 0;
    let oddSum = 0;

    a.forEach((element, index) => {
        if(index % 2 == 0){
            evenSum += element;
        }
        else{
            oddSum += element;
        }
    });

    return [evenSum,oddSum];
}

console.log(AlternatingSums([10,21,31,40,51]));