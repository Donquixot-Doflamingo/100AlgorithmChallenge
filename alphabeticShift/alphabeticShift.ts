function alphabeticShift(input : string) : string{
    const alphabet: string[] = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j','k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
    let inputShifted = input.split('');
    console.log(inputShifted);
    for(let i = 0; i < input.length ; i++){
        let index = 0;
        if(inputShifted[i] !== 'z'){
            index = alphabet.indexOf(inputShifted[i]) + 1;
            console.log(index);
        }

        inputShifted[i] = alphabet[index];
    }
    return inputShifted.join('');
}

console.log(alphabeticShift("hello"));
// console.log(alphabeticShift(""));