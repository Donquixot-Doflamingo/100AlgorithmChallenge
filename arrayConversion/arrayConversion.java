package arrayConversion;

public class arrayConversion {
    public static int arrayConversionToInt(int[] num){
        boolean isOdd = true;

        while(num.length != 1){
            num = sumProduct(num, isOdd);
            isOdd = !isOdd;
        }
        
        return num[0];
    }

    private static int[] sumProduct(int[] num, boolean isOdd) {
        int[] sumProduct = new int[num.length/2];

        if(isOdd){
            for(int i = 0, j = 0; i < num.length - 1 && j < sumProduct.length; i += 2, j++)
                sumProduct[j] = num[i] + num[i+1];
        }
        else{
            for(int i = 0, j = 0; i < num.length - 1 && j < sumProduct.length; i += 2, j++)
                sumProduct[j] = num[i] * num[i+1];   
        }
    
        return sumProduct;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        System.out.println(arrayConversionToInt(arr));
    }
}
