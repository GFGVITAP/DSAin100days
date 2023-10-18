//this is brute force code.with no optimization.
//here there are three nested for loops. so time complexity is big O of n cube
public class Maximum_Subarray_Sum {
    public static void main(String[] args){
        int array[]={2,4,-6,-8,10};
       maxsumsubarray(array);
}
public static void maxsumsubarray(int a[]){
    int max_sum=Integer.MIN_VALUE;
    for(int k=0;k<a.length;k++){
        for(int i=0;i<a.length;i++){
            int current_sum=0;
        for(int j=0+k;j<a.length-i;j++){
            System.out.print(a[j]+" ");
             current_sum += a[j];
        }
        System.out.println();
        if(max_sum<current_sum){
            max_sum=current_sum;
        }
          
       }
    }
    System.out.println(max_sum);
}

}
