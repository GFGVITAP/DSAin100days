import java.util.Arrays;

class Sort012{
    public static void sort012(int arr[]){
        int left=0,right=arr.length-1;
        int current=0,temp;

        while(current<=right){
            if(arr[current]==0){
                temp=arr[left];
                arr[left]=arr[current];
                arr[current]=temp;
                left++;
                current++;
            }
            else if(arr[current]==2){
                temp=arr[right];
                arr[right]=arr[current];
                arr[current]=temp;
                right--;
            }
            else{
                    current++;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={2,2,0,1,0,2,0,0,0,1,1,2,1,2,0};
        System.out.println(Arrays.toString(arr));
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}