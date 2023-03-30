package AdjacentElementsProduct;

public class AdjacentElementsProduct {
    public static int AdjacentElements(int arr[]){
        if(arr.length == 0) return -1;

        if(arr.length == 1) return arr[0];

        int largest = arr[0] * arr[1];

        for(int i = 1; i < arr.length - 1; i++){

            int product = arr[i] * arr[i+1];
    
            largest = largest < product ? product : largest;
        }

        return largest;
    }
    public static void main(String[] args) {

        int arr[] = {11,12,-1,-133};

        System.out.println(AdjacentElements(arr));
    }

}
