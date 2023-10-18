public class QUe {
 class que{
    static int arr[];
    static int size;
    static int rear;
    que(int n){
        arr = new int[n];
        size =n;
        rear=-1;
    }
    public static Boolean isempty(){
        return rear==-1;
        //this acts like a if else condition
    }
    //add/or enque
    public static void add(int data){
        //first check if que is full or not
        if( rear== size-1){
            System.out.println("que is full");
            return;
        }
        else{
            rear++;
            arr[rear]= data;
            //addition is done from back so we use rear

        }
    }
    public static int remove(){
        //first check wether que is empty or not 
        if(rear==-1){
            System.out.println("que is empty");
            return -1;
        }
        // now we gonna return front
        int front= arr[0];
        //we also need ot delete it from the que
        for(int i=0;i<rear;i++){
            arr[i]= arr[i+1];
        }
        rear= rear-1;
         return front; 
        }
    public static int peak(){
        //it means just to see the first elemnt
        //first check wether que is empty or not 
        if(rear==-1){
            System.out.println("que is empty");
            return -1;
        }
        return arr[0];
    }
 }
 public static void main(String[] args) {
    // que q = new que(5);
    // q.add(1);
    // q.add(2);
    int a[]={1,2,3,4};
    System.out.println(a[3]);
 }    
}
   //it is a data structure in which fifo is done.
    // first in first out
    // it is a like a pipe
    // exit will be done from front and entering is done from rear end
//que has three operations
// 1.ADD or enque
// 2.remove or dequeue
// 3.peek or front
// two pointers front and rear
// front always points index 0 ie the first index and rear points the last element index
// front doesnt update rear pointer only updates
// Que can be implemented using the following:
// 1.array
// 2.LinkedList
// 3.stack