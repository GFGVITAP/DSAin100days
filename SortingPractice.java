// Question :Use the following sorting algorithms tosort an array in DESCENDING order :
// a.Bubble Sort
// b.Selection Sort
// c.Insertion Sort
// d.Counting Sort
// You can use this array as an example :[3,6,2,1,8,7,4,5,3,1]



public class SortingPractice {
    public static void main(String[] args) {
        int array[]= {3,6,2,1,8,7,4,5,3,1};
        BSort(array);
        printarr(array);
        SSort(array);
        printarr(array);
        ISort(array);
        printarr(array);
        CSort(array);
        printarr(array);
    }
    //print function
    public static void printarr(int a[]){
    for(int i:a)
    System.out.print(i+" ");
    System.out.println();
    }
    //Bubble Sort
    public static void BSort(int a[]){
        //outer loop to iterate elements
        for(int i=1;i<a.length;i++){
            //inner loop to swap elements to right place
            for(int j=0;j<a.length-i;j++){
                int temp_min= Math.min(a[j], a[j+1]);
                int temp_max = Math.max(a[j], a[j+1]);
                 a[j]= temp_min;
                 a[j+1]= temp_max;
            }
        }
    }
    //Selection Sort
    public static void SSort(int a[]){
        for (int i = 0; i < a.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = a[i];
            a[i] = a[minIndex];
            a[minIndex] = temp;
        }
    }
    //Insertion Sort
    public static void ISort(int a[]){
        //we consider the first elemnet  of the array to be sorted paar and remaining to be unsorted
        //we then take the remaining part of the array that is considered as unsorted
        //take the first element in the unsorted and position it in the sorted part
        for(int i=1;i<a.length;i++){
            int curr= a[i];
            int prev= i-1;
            //finding out currect position to insert
            //this while loop basically runs till the 
            //previous index is 0 and the current element is less then previous element
            // ie till we find the right position of the current element the while loop 
            //continues
            while(prev>=0 && a[prev]>curr){

                a[prev+1]= a[prev];
                prev--;
            }
            //now inserting the element 
            a[prev+1]=curr;

        }
        }
    //Counting Sort
    public static void CSort(int a[]){
        //an array to count the frequency of the each element is creted with the length of the max element
        // this method is only useful if the rang is small only
        int max=Integer.MIN_VALUE;
        //finding the max elemnet in the array
        for(int i: a){
            max= Math.max(max, i);
        }
        int b[] = new int[max+1];
        //this array contains frequency of each elemnt
        //we now count the frequency of each elemnet in the given array and update it 
        for(int i=0;i<a.length-1;i++ ){
            b[a[i]]++;
        }
        //sosrting the array based on the frequency array b
        int j=0;
        for(int i=0;i<b.length;i++){
            while(b[i]>0){
                a[j]= i;
                b[i]--;
                j++;
            }
        }
    }

    }


