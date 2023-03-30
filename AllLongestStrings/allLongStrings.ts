function allLongStrings(arr:string[]):string[]{

    if(arr.length == 0) return ["Empty String"];

    if(arr.length == 1) return [arr[0]];

    let longest = 0;

    const longestWords = [];

    arr.forEach((word : String) => {
        longest = longest < word.length ? word.length : longest;
    });

    arr.forEach((word : String) => {
        if(word.length == longest)
            longestWords.push(word);
    });
    return longestWords;
}

console.log(allLongStrings(["123", "543", "3", "23324"]))