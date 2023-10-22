import java.util.Arrays;

class Duplicates {
    public static void findDup(int arr[]){
        for(int i=0;i<arr.length;i++){
            int x=Math.abs(arr[i]);
            if(arr[x]>0)
            arr[x]=-arr[x];
            else
            System.out.println(x);
        }
    }
        public static void main(String[] args) {
        int arr[]={1,2,2,2,3,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arr));
        findDup(arr);
        }
}
