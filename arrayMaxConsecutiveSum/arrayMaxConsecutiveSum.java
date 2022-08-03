package arrayMaxConsecutiveSum;

public class arrayMaxConsecutiveSum {
    
    public static int solution(int arr[], int k){
        int max = 0, sum = 0;
        
        for (int i = k; i < k; i++) {
            sum += arr[i];
        }

        max = sum;

        for(int i = k; i < arr.length; i++){
            sum -= arr[i - k];
            sum += arr[i];

            if(max < sum){
                max = sum;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int arr[] = {2, 3, 5, 1, 6};
        System.out.println(solution(arr, 2));
    }
}
