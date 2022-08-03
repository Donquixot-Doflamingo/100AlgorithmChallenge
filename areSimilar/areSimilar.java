package areSimilar;

import java.util.Arrays;

public class areSimilar {

    public static boolean solution(int [] a, int b[]){

        if(Arrays.equals(a,b))
            return true;
        
        int [] c  = new int[a.length];
        int [] d = new int[a.length];

        for(int i = 0; i < a.length; i++){
            if(a[i] != b[i]){
                c[i] = a[i];
                d[i] = b[i];
            }
        }
        
        d = reverse(d);

        if(Arrays.equals(c,d)){
            return true;
        }
        
        return false;
    }

    static int[] reverse(int[] array) {
        int[] newArray = new int[array.length];
 
        for (int i = 0; i < array.length; i++) {
            newArray[array.length - 1 - i] = array[i];
        }
 
        return newArray;
    }

    static void printArray(int arr[]){
        for (int i : arr) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        int [] a = {1, 2, 2};
        int b[] = {2, 1, 1};
        System.out.println(solution(a,b));
    }
}
