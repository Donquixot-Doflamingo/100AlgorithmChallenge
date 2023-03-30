package AlmostIncreasingSequence;

public class AlmostIncreasingSequence{

    public static boolean isStrictlyIncreasing(int arr[]){
        int i;
        for(i=0;i<arr.length-1;i++){
            if(arr[i]>=arr[i+1])
            {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,8,9};
        System.out.println(isStrictlyIncreasing(arr));
    }
}