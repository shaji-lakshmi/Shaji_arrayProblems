/*
 This program contains methods that take in an arraylist and manipulates the array or derives information from the elements of the array. 
 I chose to create random elements to populate the array with numbers ranging from 1 to 12. Look at this array as results of someone
 rolling 2 dice. The programs takes a randomly generated array list and manipulates it accordingly. This program deals with arraylists 
 containing integers only.
 */
package arrayproblems_int;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Lakshmi Shaji
 */
public class ArrayProblems_int {

    public static void generateRandomResults(ArrayList<Integer> rollResults) {
        int roll;
        
        for (int i = 0; i <= 50; i++) {
            Random results = new Random();
            roll = results.nextInt(12) + 1;
            rollResults.add(roll);

        }
        System.out.println("Original populated array: ");
        System.out.println(rollResults);
    }
    
    public static int divisibleByFour(ArrayList<Integer> rollResults){
        
        Integer [] newarr = null; 
        int count =0; 
            
            newarr = rollResults.toArray(new Integer[rollResults.size()]); 
            for(int i=0; i< newarr.length; i++){
                if(newarr[i] %4 == 0){
                    count +=1;
                }
            }
        
        return count;
    }
    
    public static int sumArray(ArrayList<Integer> rollResults){
         Integer [] newarr = null; 
        int sum =0; 
            
            newarr = rollResults.toArray(new Integer[rollResults.size()]); 
            for(int i=0; i< newarr.length; i++){
                sum+= newarr[i];
            }
            return sum;
    }
    
    public static double probTwelve(ArrayList<Integer> rollResults){
        Integer [] newarr = null; 
        int count =0; 
        double prob; 
            
            newarr = rollResults.toArray(new Integer[rollResults.size()]); 
            for(int i=0; i< newarr.length; i++){
                if(newarr[i] == 12){
                    count+=1; 
                }
            }
            prob = (count/50.0) *100;
            return prob; 
    }
    
    public static void removeFromList(ArrayList<Integer> rollResults){
        Integer [] newarr = null; 
        int removeInt =11; 
        double prob; 
            
            newarr = rollResults.toArray(new Integer[rollResults.size()]); 
            for(int i=0; i< newarr.length; i++){
                if(newarr[i] == removeInt){
                    rollResults.remove(i);
                    newarr = rollResults.toArray(new Integer[rollResults.size()]); 
                    
                }
            }
            System.out.println("New array that does not contain the number 11 in the list is: ");
            System.out.println(rollResults);
    }
    
    public static void findIndex(ArrayList<Integer> rollResults){
        ArrayList<Integer> listOfIndexes = new ArrayList<Integer>();
        Integer [] newarr = null; 
        int desiredInt = 6; 
        double prob; 
            
            newarr = rollResults.toArray(new Integer[rollResults.size()]); 
            for(int i=0; i< newarr.length; i++){
                if(newarr[i] == desiredInt){
                    listOfIndexes.add(i);
                }
            }
            System.out.println("The positons(indexes) where the number 6 appears in the list of results is: ");
        System.out.println(listOfIndexes);
    }

    public static void main(String[] args) {
        ArrayList<Integer> rollResults = new ArrayList<Integer>();
        generateRandomResults(rollResults);
        System.out.println("");
        System.out.println("When you roll two die 50 times, the number of times the sum of the two dice equals a number divisible by four is:");
        System.out.println(divisibleByFour(rollResults));
        System.out.println("");
        System.out.println("Sum of all elements in the array: ");
        System.out.println(sumArray(rollResults));
        System.out.println("");
        System.out.println("Out of the 50 rolls in this simulation, a 12 was rolled "+ probTwelve(rollResults) + "% of the time");
        System.out.println("");
        removeFromList(rollResults);
        System.out.println("");
        findIndex(rollResults);

    }

}
