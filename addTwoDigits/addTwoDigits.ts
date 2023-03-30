function addTwoDigits(num : number) : number{
    if(num > 99 || num < 10) return -1;

    const n = num.toString().split('');

    return parseInt(n[0]) + parseInt(n[1]);

}

console.log(addTwoDigits(999));
console.log(addTwoDigits(99));
console.log(addTwoDigits(9));
console.log(addTwoDigits(82));