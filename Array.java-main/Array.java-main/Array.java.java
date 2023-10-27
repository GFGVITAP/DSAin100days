/*Array 
==>collects elements of the same data type and store them in contiguous
In this code you can the before insertion and after insertion of array
*/
import java.util.Scanner;
public class Main
{
public static void main(String[] args) 
{
int len, a,b;
Scanner sc = new Scanner(System.in);
System.out.print("Enter length of an array:");
len = sc.nextInt();
int arr[] = new int[len+1];
System.out.println("Enter "+len+" all the elements:");
for(int i = 0; i < len; i++)
{
arr[i] = sc.nextInt();
}
System.out.print("Enter the position where you want to insert an element:");
a = sc.nextInt();
System.out.print("Enter the element which you want to insert:");
b = sc.nextInt();
for(int i = len-1; i >= (a-1); i--)
{
arr[i+1] = arr[i];
}
arr[a-1] = b;
System.out.print("After inserting : ");
for(int i = 0; i <=len; i++)
{
System.out.print(arr[i]+",");
}

}
}
