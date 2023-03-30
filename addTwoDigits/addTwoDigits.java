// package 100AlgorithmChallenge.addTwoDigits;

public class addTwoDigits {
    public static int addTwoDigit(int n){
        if(n > 99 || n < 10) return -1;
        
        return n/10 + n % 10;
    }
}
