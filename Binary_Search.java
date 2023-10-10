public class Binary_Search {
    public static void main(String[] args) {
        int array[]= {2,4,6,8,10,12,16,18,20};
        //binary search is only done for sorted array
        int key=120;
       System.out.println("index for key is "+BinarySearch(array,key));

    }
    public static int BinarySearch(int a[],int s){
        int start= 0;
        int end= a.length-1;
        while(start<=end){
            int mid= (start+end)/2;
            if(a[mid]==s){
                return mid;
            }
            if(a[mid]>s){
                end =mid-1; 
            }
            else {
                start = mid+1;
            }
        }
    return -1;
    }
    
}
//the time complexity of binary search algo is log n to the base 2. ie  big O of logn to basse 2.
//binary search always outperforms linear search

