package AlternatingSums;

import java.util.ArrayList;

public class AlternatingSums {
    public static ArrayList<Integer> AlternatingSum(int[] arr){
        int evenSUm = 0, oddSum = 0;

        for(int i = 0; i < arr.length; i++){
            if(i % 2 == 0)
                evenSUm += arr[i];
            else
                oddSum += arr[i]; 
        }

        ArrayList<Integer> arrReturn = new ArrayList<>();
        arrReturn.add(evenSUm);
        arrReturn.add(oddSum);

        return arrReturn;
    }   

    public static void main(String[] args) {
        int arr[] = {10,21,31,40,51};  
        System.out.println(AlternatingSum(arr));
          
    }
}
