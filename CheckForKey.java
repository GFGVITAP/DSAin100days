package Recursion;

import java.util.Scanner;


public class CheckForKey {
    public static int Fkey(int arr[],int key,int i){
        if(i==arr.length){
            System.out.println("Key not found ");
            return -1;
        }
        if(arr[i]==key){
            
            System.out.println("Key Found at index :"+ i);
            return 1;
            
        }
        
        return Fkey(arr, key, i+1);
    }
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Size of Array ");
        int x=sc.nextInt();
        
        int n[]=new int[x];
        System.out.println();
        System.out.println("Input the values in Array ");
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println();

        System.out.println("do you want to find a key of a  value  ");
        System.out.print("Enter 1 for Yes "+" / ");
        System.out.println("Enter 0 for No.");
        int inp=sc.nextInt();
        if(inp==1){
            System.out.println("Enter the number you want to find ");
            int y=sc.nextInt();
            System.out.print(Fkey(n, y, 0));
  
        }
        else if(inp==0){
            System.out.println("OK");
        }
        else if(inp!=1 || inp!=0){
            System.out.println("Enter a valid input");
        }
    }
}
