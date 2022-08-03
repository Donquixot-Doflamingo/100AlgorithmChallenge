function areEquallyStrong(yourLeft : number,yourRight : number, friendsRight : number, friendsLeft : number) : boolean{
    const yourWeakest = yourLeft <= yourRight ? yourLeft : yourRight;
    const yourStongest = yourLeft >= yourRight ? yourLeft : yourRight;
    const friendsWeakest = friendsLeft <= friendsRight ? friendsLeft : friendsRight;
    const friendsStongest = friendsLeft >= friendsRight ? friendsLeft : friendsRight;

    return yourWeakest === friendsWeakest && yourStongest === friendsStongest;
}

console.log(areEquallyStrong(10,15,1,10))