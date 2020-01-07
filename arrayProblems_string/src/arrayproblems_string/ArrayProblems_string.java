/*
This program manipulates an array of strings.
 */
package arrayproblems_string;

/**
 *
 * @author Lakshmi Shaji
 */
public class ArrayProblems_string {

    //Print the original array
    public static void printArray(String[] strArr) {
        System.out.println("Original array elements: ");
        for (int i = 0; i < strArr.length; i++) {
            System.out.print(strArr[i] + " ");
        }
    }

    //Take the second letter from each word in an array in order to create a new word from the derived letters
    public static void createWord(String[] strArr) {
        int j = 1;
        for (int i = 0; i < strArr.length; i++) {
            char r = strArr[i].charAt(j);
            System.out.print(r);
        }
    }
    // Replace an element in the array with another string. 
    public static void changeElement(String[] strArr) {
        String word = "alive";
        String replace = "slice";
        for (int i = 0; i < strArr.length; i++) {
            if (strArr[i].equalsIgnoreCase(word)) {
                strArr[i] = replace;
            }
            System.out.print(strArr[i] + " ");
        }
    }
    
    //Find the number of a specified character in the given array of strings
    public static int numAs(String [] strArr){
        char desiredChar = 'a'; 
        int count =0;
        for(int i=0; i<strArr.length; i++){
            for(int j=0; j< strArr[i].length(); j++){
                if(strArr[i].charAt(j) == desiredChar){
                    count++;
                }
            }
        }
        return count; 
    }
    
    public static void reverseArr(String [] strArr){
        for(int i=strArr.length-1; i>=0; i--){
            System.out.print(strArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        String[] strArr = {"save", "apartment", "upfront", "alive", "pet"};
        printArray(strArr);
        System.out.println("");
        System.out.println("");
        System.out.println("Take the second letter from each word in an array in order to create a new word from the derived letters.");
        createWord(strArr);
        System.out.println("");
        System.out.println("");
        System.out.println("The element \"alive\" has been replaced by the word \"slice\"");
        changeElement(strArr);
        System.out.println("");
        System.out.println("");
        System.out.println("The number of 'A' characters in this array after replacement of element is: " + numAs(strArr));
        System.out.println("");
        System.out.println("The Array reversed produces: ");
        reverseArr(strArr);
        System.out.println("");
    }

}
