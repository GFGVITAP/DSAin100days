public class Subarrays_Of_an_Array {
    public static void main(String[] args){
            int array[]={1,2,3,4,5,6};
            subarray(array);
    }
    public static void subarray(int a[]){
        int total=0;
        for(int k=0;k<a.length;k++){
            for(int i=0;i<a.length;i++){
            for(int j=0+k;j<a.length-i;j++){
                System.out.print(a[j]+" "); 
                total++;  
            }
            System.out.println();
              
           }
        }
        System.out.println(total);
    }
}

//alternative code


// public class Subarrays_Of_an_Array {
//     public static void main(String[] args){
//             int array[]={1,2,3,4,5,6};
//             subarray(array);
//     }
//     public static void subarray(int a[]){
//         int total=0;
//         for(int i=0;i<a.length;i++){
//             int start =i;
//             for(int j=i;j<a.length;j++){
//                  int end=j;
//             for(int k=start;k<=end;k++){
//                total++; 
//                 System.out.print(a[k]+" "); 
//             }
             
//             System.out.println();
              
//            }
//            System.out.println();
//         }
//         System.out.println(total);
//     }
// }

