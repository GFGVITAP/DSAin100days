package Solution.java;

public class tripletsum {
    public static void TS(int arr[]){
        int x=arr.length;
        int ar1[]=new int[2];
        for (int i=0;i<x;i++){
            int a=arr[i];
            for(int j=i+1;j<x;j++){
                int b=arr[j];
                for(int k=j+1;k<x;k++)
                   {
                    int c=arr[k];
                    if(a+b+c==0){
                        System.out.println("["+a+" , "+b+" , " +c +"]");
                    }
                    
                   }


            }

        }
    }
    public static void main(String[] args) {
       int arr []= {-1, 0,  1, 2, -1, -4} ;
       TS(arr);
    }
    
}
