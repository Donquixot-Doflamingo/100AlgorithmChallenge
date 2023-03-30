package arrayPreviousLess;

import java.util.ArrayList;
import java.util.Collections;

public class arrayPreviousLess {

    public static int[] arrayPreviousLesserAlgoMine(int arr[]){

        int arr2[] = new int[arr.length];

        arr2[0] = -1;

        for(int i = 1, j = 1; i < arr.length && j < arr2.length; i++, j++){
            if(arr[i] > arr[i-1]){
                arr2[j] = arr[i-1];
            }
            else{
                arr2[j] = -1;
            }
        }

        return arr2;
    }

    public static ArrayList<Integer> arrayPreviousLesserAlgoAuthor(int items[]){

        ArrayList<Integer> lessThanList = new ArrayList<Integer>(items.length);

        for(int i = items.length - 1; i >= 0; i--){
            for(int j = i; j >= 0; j --){
                if(items[i] > items[j]){
                    lessThanList.add(items[j]);
                    break;
                }
                else if(j == 0){
                    lessThanList.add(-1);
                }
            }
        }
        Collections.reverse(lessThanList);

        return lessThanList;
    }

    public static void mine(){
        int arr[] = {3,5,2,4,5};
        int arr2 [] = arrayPreviousLesserAlgoMine(arr);
        System.out.print('[');
        for (int i : arr2) {
            System.out.print(i + ", ");
        }
        System.out.print(']');
    }

    public static void author(){
        int arr[] = {3,5,2,4,5};
        System.out.println();
        System.out.println(arrayPreviousLesserAlgoAuthor(arr));
    }

    public static void main(String[] args) {        
        mine();
        author();
    }
}
