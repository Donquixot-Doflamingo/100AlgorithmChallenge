// console.log(albhabetSubSequence("helllo"));

function albhabetSubSequence(s : string): boolean {
    const chars : string[] = s.split('');
    const charvalue : number[] = [];

    chars.forEach((char : string) => {
        charvalue.push(char.charCodeAt(0));
        console.log(charvalue)
    });

    if(new Set(charvalue).size != charvalue.length)
        return false;
    
    for(let i = 0; i < charvalue.length - 1; i++){
        if(charvalue[i] > charvalue[i+1])
            return false;
    }

    return true;
}

console.log(albhabetSubSequence("effg"));
// console.log(albhabetSubSequence("zab"));
// console.log(albhabetSubSequence("efg"));