package alphabetSubSequence;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class alphabetSubSequence {

    public static boolean alphabetSubSequenc(String s){
        char[] chars = s.toCharArray();
        ArrayList<Integer> charValue = new ArrayList<>();

        for (char str : chars) {
            int i = str;
            charValue.add(i);
        }

        Set<Integer> set = new HashSet<Integer> ();

        set.addAll(charValue);

        if(set.size() != charValue.size())
            return false;
        
        for(int i = 0; i < charValue.size() - 1; i++){
            if(charValue.get(i) > charValue.get(i + 1)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(alphabetSubSequenc("zab"));
    }
}



// class exampleClass{

//     public static String[] returnOut(String textInput){
//         String [] words = textInput.split("");
//         return words;
//     }

//     public static boolean returnOut(String textInput,String textInput1){
//         return textInput == textInput1;
//     }

//     static int search(String[]arr, String s){
//             int counter = 0;
//             for (int j = 0; j < arr.length; j++)
 
//                 /* checking if string given in query is
//                   present in the given string. If present,
//                   increase times*/
//                 if (s.equals(arr[j]))
//                     counter++;
//            return counter;
//     }


//     public static void adam(int[] arr, int[] ay){
//         int m = arr.length, n = ay.length, o = m+n;
//         int[] array = new int[o];
//         int i = 0, j = 0, k = 0;
//         while(i< m && j < n){
//             if(arr[i] < ay[j]){
//                 array[k] = arr[i];
//                 i++;
//                 k++;
//             }
//             else{
//                 array[k] = ay[j];
//                 j++;
//                 k++;
//             }
//         }
//         while(i < m){
//             array[k] = arr[i];
//             i++;
//             k++;
//         }

//         while(j < n){
//             array[k] = ay[j];
//             j++;
//             k++;
//         }

//         for(int in : array){
//             System.out.println(in);
//         }
//     }

//     static public void main(String[] args) {
//         // int arr[] = {2};
//         // int ay[] = {1,2};
//         // adam(arr, ay);

//     }
// }

//
//     A company Dictory is launching a new dictionary application for mobile users. Initially, the dictionary will not
//     have any words. Instead it will be an auto-learning application that will earn according to a user's given text.
//     When a user types text, the application auto-detects the words that appear more than once. The application then stores
//     these words in the dictionary and uses them as suggestions in future typing sessions. Write an algorithm to identify which
//     words will he saved in the dictionary.

//     Input 
//     The input consists of a string textinput, representing the text that is given as an input to the application
//     by the user

//     Output
//     Print space-separated strings in the lexicographically sorted order representing the number of repeated words detected 
//     in the input text and if no word is repeated "NA"

//     Note 
//     A word is an alphabetic sequence of characters having no whitespace and there is no punctuation in the input text.
//     textlnout is case-sensitive (i.e. cat and CAT are considered as different words not same).

//     It contains lowercase and uppercase English alphabetst.e.a-(A-Z].

//     Example
//     input : cat batman latt matter cat matter cat

//     Output: cat matter

//     Explanation: The word "cat' is repeated three times and the word "matter repeated two times in the texi.
//     So, the dictionary will store ["cat "matter"].
//  

// // Java Program to illustrate Overriding
// // toString() Method

// // Class 1
// class GFG {
	
// 	// Main driver method
// 	public static void main(String[] args) {
		
// 		// Creating object of class1
// 		// inside main() method
// 		Complex c1 = new Complex(10, 15);
		
// 		// Printing the complex number
// 		System.out.println(c1);
// 	}
// }
// // Class 2
// // Helper class
// class Complex {
	
// 	// Attributes of a complex number
// 	private double re, im;
	
// 	// Constructor to initialize a complex number
// 	// Default
// 	// public Complex() {
// 	//	 this.re = 0;
// 	//	 this.im = 0;
// 	// }
	
// 	// Constructor 2: Parameterized
// 	public Complex(double re, double im) {
		
// 		// This keyword refers to
// 		// current complex number
// 		this.re = re;
// 		this.im = im;
// 	}
// 	// Getters
// 	public double getReal() {
// 		return this.re;
// 	}
// 	public double getImaginary() {
// 		return this.im ;
// 	}
// 	// Setters
// 	public void setReal(double re) {
// 		this.re = re;
// 	}
// 	public void setImaginary(double im) {
// 		this.im = im;
// 	}
// 	// Overriding toString() method of String class
    
// 	public String toString() {
// 		return this.re + " + " + this.im + "i";
// 	}
// }

