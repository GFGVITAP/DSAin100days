public class CountingSort {
    public static void main(String[] args) {
        int array[]={5,4,3,2,1};
        Counting_sort(array);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    //this sorting is used when the no of elemnts to sort are smaller in range
// we make an empty array count which is same size as of the given array
public static void Counting_sort(int a[]){
    //there will be a total of two for loops in this code 
    //one for conting the frequency and storing it in an array
    //another for sorting the array
    //the array in which we store the code has the length equal to the max element of the array
    // loop1: to find the max  element in the array
    int max= Integer.MIN_VALUE;
    for(int i:a){
        max= Math.max(max, i);
    }
    //an empty array for frequency of size of amx element is made
    int b[]= new int[max+1];
     //loop2: to count frequency  of the element in the array
        for(int i=0;i<a.length;i++){
        b[a[i]]++;
        }
     
     //loop 3 for sorting based on array b
     int j=0;
     for(int i=0;i<b.length;i++){
        while(b[i]>0){
            a[j]=i;
            j++;
            b[i]--;
        }
     }
}
}

