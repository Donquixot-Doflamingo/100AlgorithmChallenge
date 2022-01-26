import java.util.ArrayList;

public class addBorder {
    public static ArrayList<String> addBorders(ArrayList<String> arr){
        int elementLength = arr.get(0).length() + 2;
        arr.add(0, "*".repeat(elementLength));
        arr.add("*".repeat(elementLength));

        for(int i = 1; i < arr.size() - 1 ; i++){
            arr.set(i, "*".concat(arr.get(i).concat("*")));
        }
        return arr;
    }

    public static String[] addBorderInArray(String arr[]){
        String[] newArr = new String[arr.length + 2];

        int elementLength = arr[0].length() + 2;
        String starString = "";
        for(int i = 0; i < elementLength; i++){
            starString = starString + "*";
        }
        newArr[0] = starString;
        newArr[newArr.length-1] = starString;

        for(int i = 1; i < newArr.length - 1; i++){
            newArr[i] = "*" + arr[i-1] + "*";
        }

        return newArr;
    }

    public static void main(String[] args) {
        // ArrayList<String> arr = new ArrayList<String>();
        // arr.add("abc");
        // arr.add("def");
        String[] arr = {"abc", "def"};
        String[] newArr = addBorderInArray(arr);
        for(int i = 0; i < newArr.length; i++){
            System.out.println(newArr[i]);
        }
    }
}