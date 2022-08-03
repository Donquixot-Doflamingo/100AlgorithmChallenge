package areEquallyStrong;

public class areEquallyStrong{
    public static boolean solution(int yourLeft, int yourRight, int  friendsRight, int friendsLeft){
        int yourWeakest = yourLeft <= yourRight ? yourLeft : yourRight;
        int yourStongest = yourLeft >= yourRight ? yourLeft : yourRight;
        int friendsWeakest = friendsLeft <= friendsRight ? friendsLeft : friendsRight;
        int friendsStongest = friendsLeft >= friendsRight ? friendsLeft : friendsRight;

        return yourWeakest == friendsWeakest && yourStongest == friendsStongest;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 15, 15, 10));
    }
}