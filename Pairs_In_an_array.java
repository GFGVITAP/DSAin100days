public class Pairs_In_an_array {
    //total number off pairs that can be formed from an array is sum of n-1 numbers 
    //ie n(n-1)/2.
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        pairs(array);
    }
    public static void pairs(int a[]){
        // int first=0;
        // int last= a.length-1;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                System.out.print("("+a[i]+","+a[j]+")");
            }
        }

    }
}
