package arrayMaximalAdjacentDifference;

public class arrayMaximalAdjacentDifference{
    public static int arrayMaximalAdjacentDiff(int[] arr){
        int maxDiff = Math.abs(arr[0] - arr[1]);

        for(int i = 1; i < arr.length; i++){
            int absoluteDiff = Math.abs(arr[i - 1] - arr[i]);
            maxDiff = absoluteDiff > maxDiff ? absoluteDiff : maxDiff;
        }
    
        return maxDiff;
    }
    public static void main(String[] args) {
        int [] arr = {4,1,2,1};

        System.out.println(arrayMaximalAdjacentDiff(arr));
    }
}