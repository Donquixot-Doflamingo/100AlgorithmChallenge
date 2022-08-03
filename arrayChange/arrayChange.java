package arrayChange;

public class arrayChange {
    public static int arrayChanges(int[] arr){
        int count = 0;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] >= arr[i+1]){
                count += arr[i] - arr[i+1] + 1;
                arr[i+1] += arr[i] - arr[i+1] + 1;
            }
        }
        return count;
    }  

    public static void main(String[] args) {
        int arr[] = {1,2,2,-1};
        System.out.println(arrayChanges(arr));
    }
}
