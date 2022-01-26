// package absoluteValuesSumMinization;

public class absoluteValuesSumMinization{

    public static int absoluteValuesSum(int [] a){
        boolean isEven = a.length % 2 == 0;
        int len = a.length / 2;
        int l = (int)Math.floor(len);
        return isEven? a[len - 1] : a[l];
    }

    public static void main(String[] args) {
        int arr[] = {2,4,7};
        int hello = absoluteValuesSum(arr);
        System.out.println(hello);
    }
}
