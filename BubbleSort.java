public class BubbleSort {
    //sorting is the process of arrangong the elemnts in either ascending or desceding order
    //in bubble sort this sorting process is done by swapping the adjescent elemnts till the sorted array is obtained
    public static void main(String[] args) {
        int array[]={5,4,3,2,1};
        // System.out.println(bsort(array));
        bsort(array);
        for(int i:array){
            System.out.print(i+" ");
        }

    }
    public static void bsort(int a[]){
        int temp= 0;
        for(int i=0;i<a.length-1;i++){
            for(int j=0;j<a.length-i-1;j++){
                if(a[j]>a[j+1]){
                    temp =a[j];
                    a[j]= a[j+1];
                    a[j+1]= temp;
                }
            }

            

            }
        }

    }

