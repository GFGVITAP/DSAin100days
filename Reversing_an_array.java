public class Reversing_an_array {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        //the best way to reverse an array is to swap the elents from either sides.
        // ie we swap 1:6;2:5;3:4; indexes. and then we increase the value of first and decreaes the values of last indexe.
        reverse(array);
        for(int i:array){
            System.out.print(i+" ");//if we keep println all wont come in a single line.
        }
    }
    public static void reverse(int a[]){
        int first=0;
        int last= a.length-1;
        while(first < last){
            // int mid= (first+last)/2;
            int temp =a[last];
            a[last]=a[first];
            a[first]= temp; 
            first++; //adds 1 to first
            last--; // subtracts 1 from last
        }
    }
}
