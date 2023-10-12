// here we consider an array and name it prefix array which will contains thesum of consecutive numbers.
// we then apply the formula:
// for a subarray to which we want to find the sum we define start and end positions
// sum will be:
// sum=prefix[end]-prefix[start-1]

public class Mas_sum_subarray_Optimised_PrefixArray {
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        maxsumsubarray(array);

        
    }
    public static void maxsumsubarray(int a[]){
        int max_sum=Integer.MIN_VALUE;
        int prefix[]= new int[a.length];
        prefix[0]=a[0];
        //calculating prefix array
        for(int i=1;i<a.length;i++){
          prefix[i]= prefix[i-1]+ a[i];   
        }
        for(int k=0;k<a.length;k++){
            for(int i=0;i<a.length;i++){
                // int current_sum= prefix[k]-prefix[i-1];
                //here if i value is zero there will be an error. so we use terenary operator to create a condition
                int current_sum= i==0?prefix[k]:prefix[k]-prefix[i-1];
                if(max_sum<current_sum){
                    max_sum=current_sum;
                }
            }
              
           }
           System.out.println("maximum sum is "+ max_sum);
        }

    }

