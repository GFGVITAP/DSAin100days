public class InsertionSort {
    //Insertion means to put an elemnt in between something
    //Here the element from an unsorted array is taken and is put in the right position in
    //the sorted array or the sorted part
    public static void main(String[] args) {
        int array[]={5,4,3,2,1};
        insertionsort(array);
        for(int i:array){
            System.out.print(i+" ");
        }
    }
    public static void insertionsort(int a[]){
        for(int i=1;i<a.length;i++){
            int curr= a[i];
            int prev= i-1;
            //finding out currect position to insert
            while(prev>=0 && a[prev]>curr){
                a[prev+1]= a[prev];
                prev--;
            }
            //now inserting the element 
            a[prev+1]=curr;

        }
    }
}
