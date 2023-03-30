package AllLongestStrings;

import java.util.ArrayList;

public class AllLongestStrings {
    public static ArrayList<String> longestStrings(String[] arr){

        ArrayList<String> longest = new ArrayList<>();

        if(arr.length == 0) {
            longest.add("Empty");
            return longest;
        }

        if(arr.length == 1){
            longest.add(arr[0]);
            return longest;
        }
        int longWord = 0;

        for(String word : arr)
            longWord = longWord < word.length() ? word.length() : longWord;

        for(String word : arr){
            if(word.length() == longWord)
                longest.add(word);
                
        }
        return longest;
    }

    public static void main(String[] args) {
        String[] arr = {"1", "22","333","4444","4444"};
        System.out.println(longestStrings(arr));
    }
}