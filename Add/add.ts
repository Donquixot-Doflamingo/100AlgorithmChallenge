function add(para1 : number, para2 : number) : number{
    return para1 + para2;
}

function addAny(...para1 : number[]) : number{
    let total = 0;

    para1.forEach((num) => {
        total += num;
    })

    return total;
}

console.log(add(2,3));
console.log(addAny(2,3,5,6,7,8));