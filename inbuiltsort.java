import java.util.*;
import java.util.Collections;
public class inbuiltsort {
    
    public static void main(String[] args) {
        Integer [] a={5,4,3,2,1};
        Arrays.sort(a);
        Arrays.sort(a,0,5); //If you want to sort only a specific index range then we can use it.
        //to sort in descending order we use collection frameworks
        Arrays.sort(a,Collections.reverseOrder());
        Arrays.sort(a,0,5,Collections.reverseOrder()); //this is used if we want to sort in a specific index range
        
        //if the array  is in primitive datatypes it wont work.
        //So we use wrapper calss Integer since there is a collection framework reverseOrder works only on objects.
       for(int i:a)
       System.out.print(i+" ");
    }
    
}
// Sorts the specified array into ascending numerical order.

// Parameters:

// a the array to be sorted
// @implNote

// The sorting algorithm is a Dual-Pivot Quicksort by Vladimir Yaroslavskiy, 
// Jon Bentley, and Joshua Bloch. This algorithm offers O(n log(n)) performance 
// on all data sets, and is typically faster than traditional (one-pivot) Quicksort 
// implementations.


//what is the difference between sort and sorted
// sort : sorts the given array and dont produce any output
// sorted: sorts the given array and produces the output 