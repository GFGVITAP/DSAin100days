// When we add a positive number to a positive number, we get a positive number 
// when we add a positive number to a lesss negative number will get a positive number
// but when we add a positive number to a much bigger negative number we will get a negative number 
// and this condition is used by Kadane in his algorithm
public class KadanesAlgorithm {
    public static void main(String[] args) {
        int array[]={-2,-3,4,-1,-2,1,5,-3};
        Kadane(array);
    }
    public static void Kadane(int a[]) {
        int max_sum=Integer.MIN_VALUE;
        int cur_sum = 0;
        for(int i=0;i<a.length;i++){
            cur_sum=cur_sum+a[i];
            if(cur_sum<0){
                cur_sum=0;
            }
            max_sum=Math.max(cur_sum,max_sum);
        }
        System.out.println("our max subarray sum is"+max_sum);
    }
    
}
